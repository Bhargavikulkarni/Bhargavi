package Assignment;

class Customer{
	int bal;
	Customer(int bal){
		this.bal = bal;
	}
}

public class CustomerBankTransaction {
	public Customer findstatus(int bal) throws RunTimeUserExceptionEx {
		if ( bal == 500){
			 //Create your own Exception
			 throw new RunTimeUserExceptionEx ("Balance is zero...Can not withdraw money...!");
		 }
		
		return new Customer(bal); 
		 }
		public static void main(String[] args) throws RunTimeUserExceptionEx {
			CustomerBankTransaction CS = new CustomerBankTransaction();
			Customer customer = CS.findstatus(0);
		}

	}

