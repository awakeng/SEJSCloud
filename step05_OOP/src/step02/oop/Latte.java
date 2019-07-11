/* ���� ����
 * 1. ���� �н��� ���, ������ review
 * 2. ������ ���� ������ �޼ҵ� �ϳ� �߰� ����
 * 
 */
package step02.oop;

class Coffee extends Object{
	
	String origin = "�ݷҺ��";
	
	Coffee(){
		super();
	}
	
	void printAll() {
		System.out.println(origin);
	}
}

public class Latte extends Coffee{
	
	String name;
	int price;
	String taste;
	
	public Latte() {
		super();
		super.origin = "�����";
	}
	
	void printInfo() {
		System.out.println(name);
		System.out.println(taste);
		System.out.println(price);
	}
	
	void printAll() { 
		super.printAll();
		System.out.println(name);
		System.out.println(taste);
		System.out.println(price);
	}
	
	public static void main(String[] args) {
		Latte c = new Latte();
		c.name = "ī���";
		c.price = 3500;
		c.taste = "�ε巯��";
				
		c.printAll();
		System.out.println("------");
		c.printInfo();
		System.out.println("------");
		
		Coffee d = new Latte();
		Latte e = (Latte)d;
		
		//Latte r = new Latte();
		
	//	Coffee f = r;
	//	Latte g = (Latte)f;
		
		System.out.println(c instanceof Latte);
		
		d.origin = "��Ƽ���Ǿ�";
		e.name="�ٴҶ��";
		e.price= 4000;
		e.taste="�����";
		
		e.printAll();
		System.out.println("------");
		e.printInfo();
	}
}

