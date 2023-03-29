package app.core.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.core.auth.JwtUtil;
import app.core.auth.UserCredentials;
import app.core.entities.Company;
import app.core.entities.Customer;
import app.core.exception.CouponSystemException;
import lombok.Getter;

@Service
@Transactional
public class AdminServiceImpl extends ClientService implements AdminService {

	@Getter
	@Value("${admin-email}")
	private String email;

	@Getter
	@Value("${admin-password}")
	private String password;

	@Autowired
	private JwtUtil jwtUtil;

	@Override
	public String login(UserCredentials userCredentials) throws CouponSystemException {
		if (!(userCredentials.getEmail().equalsIgnoreCase(this.email)
				&& userCredentials.getPassword().equals(this.password))) {
			throw new CouponSystemException("Email or Password is wrong!");
		}
		userCredentials.setId(-1);
		return this.jwtUtil.generateToken(userCredentials);
	}

	@Override
	public void addCompany(Company company, int adminId) throws CouponSystemException {
		if (companyRepository.existsByNameAndEmail(company.getName(), company.getEmail())) {
			throw new CouponSystemException(
					"Company " + company.getName() + " cannot be added - Name and email exists");
		}
		companyRepository.save(company);
	}

	@Override
	public void updateCompany(Company company, int adminId) throws CouponSystemException {
		Company companyFromDb = companyRepository.findById(company.getId()).orElseThrow(
				() -> new CouponSystemException("Company " + company.getId() + "  code cannot be updated"));
		if (!company.getName().equals(companyFromDb.getName())) {
			throw new CouponSystemException("name cannot be updated");
		}
		companyFromDb.setEmail(company.getEmail());
		companyFromDb.setPassword(company.getPassword());
		companyRepository.saveAndFlush(companyFromDb);
	}

	@Override
	public void deleteCompany(int companyID, int adminId) throws CouponSystemException {
		if (!companyRepository.existsById(companyID)) {
			throw new CouponSystemException("Company " + companyID + " does not exists - cannot be deleted");
		}
		companyRepository.deleteById(companyID);
	}

	@Override
	public List<Company> getAllCompanies(int adminId) throws CouponSystemException {
		List<Company> allCompanies = companyRepository.findAll();
		return allCompanies;

	}

	@Override
	public Company getOneCompany(int companyId, int adminId) throws CouponSystemException {
		return companyRepository.findById(companyId)
				.orElseThrow(() -> new CouponSystemException("company " + companyId + " is not found"));
	}

	@Override
	public void addCustomer(Customer customer, int adminId) throws CouponSystemException {
		if (customerRepository.existsByEmail(customer.getEmail())) {
			throw new CouponSystemException("mail is exists");
		}
		customerRepository.save(customer);
	}

	@Override
	public void updateCustomer(Customer customer, int adminId) throws CouponSystemException {
		Customer customerFromDb = customerRepository.findById(customer.getId())
				.orElseThrow(() -> new CouponSystemException("Customer " + customer.getId() + " cannot be updated"));
		customerFromDb.setFirstName(customer.getFirstName());
		customerFromDb.setLastName(customer.getLastName());
		customerFromDb.setEmail(customer.getEmail());
		customerFromDb.setPassword(customer.getPassword());
		customerRepository.saveAndFlush(customerFromDb);
	}

	@Override
	public void deleteCustomer(int customerID, int adminId) throws CouponSystemException {
		if (!customerRepository.existsById(customerID)) {
			throw new CouponSystemException("the customer is not exists");
		}
		customerRepository.deleteById(customerID);
	}

	@Override
	public List<Customer> getAllCustomers(int adminId) throws CouponSystemException {
		List<Customer> allCustomers = customerRepository.findAll();
		return allCustomers;

	}

	@Override
	public Customer getOneCustomer(int customerId, int adminId) throws CouponSystemException {
		return customerRepository.findById(customerId)
				.orElseThrow(() -> new CouponSystemException("customer " + customerId + " is not found"));
	}

}
