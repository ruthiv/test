package app.core.entities;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "coupons")
@Builder
@ToString(exclude = { "purchases", "company" })
public class Coupon {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@JsonIgnore
	@ManyToOne
	private Company company;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Category category;
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private String description;
	@Column(nullable = false)
	private Date startDate;
	@Column(nullable = false)
	private Date endDate;
	@Column(nullable = false)
	private int amount;
	@Column(nullable = false)
	private double price;
	private String image;
	@JsonIgnore
	@ManyToMany
	@JoinTable(name = "coupons_vs_customers", joinColumns = @JoinColumn(name = "coupon_id"), inverseJoinColumns = @JoinColumn(name = "customer_id"))
	private List<Customer> purchases;

}
