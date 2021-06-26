package javaInheritance;

public class Main {

	public static void main(String[] args) {
			
//		Inheritance - Polimorphisim -> extend eden sınıfın methodlarını tutabilir
		
		
		
	IndividualCustomer oguz = new IndividualCustomer();
	CorporateCustomer wifiSpot = new CorporateCustomer();

	CustomerManager customerManager = new CustomerManager();
	
	oguz.setCustomerNumber("123456");
	wifiSpot.setCustomerNumber("789456");
	
	Customer[] customers = {oguz , wifiSpot };
	
	customerManager.multipleAdd(customers);
	
	}

}
