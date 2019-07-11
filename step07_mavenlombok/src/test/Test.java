package test;

import model.domain.Customer;

public class Test {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setName("lombok");
		c.setAge(30);
		System.out.println(c.toString());
		
	}

}
