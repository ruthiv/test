package classes;

//public class Client {
//	private int id;
//	private String name;
//	private float balance;
//	private Account[] accounts;
//	private float commissionRate;
//	private float interestRate;
//	private Logger logger;
//
//	public Client(int id, String name, float balance) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.balance = balance;
//		this.accounts = new Account[5];
//		this.logger = new Logger("TBD");
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public float getBalance() {
//		return balance;
//	}
//
//	public void setBalance(float balance) {
//		this.balance = balance;
//	}
//
//	public Account[] getAccounts() {
//		return accounts;
//	}
//
//	public void addAccount(Account account) {
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i] == null) {
//				accounts[i] = account;
//				long ts = System.currentTimeMillis();
//				float amount = account.getBalance();
//				String description = "add Account";
//				Log log = new Log(ts, this.id, description, amount);
//
//				logger.log(log);
//				return;
//			}
//		}
//		System.out.println("addAccount failed - array full");
//
//	}
//
//	public void deposit(float amount) {
//		this.balance += amount;
//		float commission = amount * commissionRate;
//		this.balance -= commission;
//		long ts = System.currentTimeMillis();
//		int id = this.id;
//		String description = "deposit";
//		Log log = new Log(ts, id, description, amount);
//
//		logger.log(log);
//	}
//
//	public void withdraw(float amount) {
//		if (amount > balance) {
//			System.out.println("failed");
//			return;
//		}
//		this.balance -= amount;
//		float commission = amount * commissionRate;
//		this.balance -= commission;
//		long ts = System.currentTimeMillis();
//		int id = this.id;
//		String description = "deposit";
//		Log log = new Log(ts, id, description, amount);
//
//		logger.log(log);
//	}
//
//	public Account getAccount(int id) {
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i] != null && accounts[i].getId() == id) {
//				return accounts[i];
//			}
//		}
//		return null;
//	}
//
//	public void removeAccount(int id) {
//		for (int i = 0; i < accounts.length; i++) {
//			// Account currAccount = accounts[i];
//			if (accounts[i] != null && accounts[i].getId() == id) {
//				this.balance += accounts[i].getBalance();
//				Account accountToDelete = accounts[i];
//				long ts = System.currentTimeMillis();
//				logger.log(new Log(ts, accountToDelete.getId(), "delete", accountToDelete.getBalance()));
//				accounts[i] = null;
//				return;
//			}
//		}
//		System.out.println("account not found");
//	}
//
//	public void autoUpdateAccounts() {
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i] != null) {
//				this.balance += accounts[i].getBalance() * interestRate;
//				long ts = System.currentTimeMillis();
//				logger.log(new Log(ts, this.id, "autoUpdateAccounts" + accounts[i].getId(), this.balance));
//			}
//		}
//	}
//
//	public float getFortune() {
//		float sum = (float) this.balance;
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i] != null) {
//				sum += accounts[i].getBalance();
//			}
//		}
//		return sum;
//	}
//
//}
