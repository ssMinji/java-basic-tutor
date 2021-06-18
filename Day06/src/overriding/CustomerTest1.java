package overriding;

import overriding.Customer;
import overriding.VIPCustomer;

public class CustomerTest1 {

	public static void main(String[] args) {

		
		
		VIPCustomer kim = new VIPCustomer(10101, "Kim", 100);

		
		kim.bonusPoint = 1000;
		
		System.out.println(kim.showInfo());

		
	}

}
