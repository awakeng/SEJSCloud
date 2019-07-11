package test;

import model.domain.Customer;

public class Test {

	public static void main(String[] args) {
		Customer c = new Customer();
		c.setNumber(30);
		System.out.println(c.getNumber());
	}

}
