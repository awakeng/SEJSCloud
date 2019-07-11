
package mainClass;

import imply.Fruits;

public class Main {
	
	static Fruits[] fruitsArray() {
		Fruits[] v = {new Fruits("딸기",27,"논산"),
					  new Fruits("수박",15,"고창"), 
					  new Fruits("사과",20,"청송")};
		return v;
	}
	
	static void printFruits(Fruits[] v) {
		for(Fruits a : v) {
			System.out.println(a.getName() + " " + a.getBrix() + " " + a.getRegion());
		}
	}

	public static void main(String[] args) {

		printFruits(fruitsArray());
	
	}

}

