
package mainClass;

import imply.Fruits;

public class Main {
	
	static Fruits[] fruitsArray() {
		Fruits[] v = {new Fruits("����",27,"����"),
					  new Fruits("����",15,"��â"), 
					  new Fruits("���",20,"û��")};
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
