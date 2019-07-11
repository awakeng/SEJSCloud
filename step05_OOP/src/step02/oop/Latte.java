/* 과제 내용
 * 1. 오늘 학습한 상속, 다형성 review
 * 2. 이해한 범위 내에서 메소드 하나 추가 개발
 * 
 */
package step02.oop;

class Coffee extends Object{
	
	String origin = "콜롬비아";
	
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
		super.origin = "브라질";
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
		c.name = "카페라떼";
		c.price = 3500;
		c.taste = "부드러움";
				
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
		
		d.origin = "에티오피아";
		e.name="바닐라라떼";
		e.price= 4000;
		e.taste="향긋함";
		
		e.printAll();
		System.out.println("------");
		e.printInfo();
	}
}

