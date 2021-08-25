package Assignment;

class Customer {
	int balance;

	Customer(int bal) {
		this.balance = bal;
	}
}

public class CustomerBankTransaction {
	public Customer findstatus(int bal) throws RunTimeUserExceptionEx {
		if (bal == 500) {
			throw new RunTimeUserExceptionEx("Balance is zero...Can not withdraw money...!");
		}

		return new Customer(bal);
	}

	public static void main(String[] args) throws RunTimeUserExceptionEx {
		CustomerBankTransaction CS = new CustomerBankTransaction();
		Customer customer = CS.findstatus(0);
	}

}
