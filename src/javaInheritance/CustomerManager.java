package javaInheritance;

public class CustomerManager {

	public void add(Customer customer) {
		
		System.out.println(customer.getCustomerNumber());
		
	}

//	bulk insert
	
	public void multipleAdd(Customer[] customers) {
		for (Customer customer : customers) {
			add(customer);
		}
	}
}
