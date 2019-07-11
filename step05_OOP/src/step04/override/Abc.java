package step04.override;


class A{}
class B extends A{}
class C extends A{}

public class Abc {
	

	public static void main(String[] args) {
		
		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		B b3 = new A();
		A a = b1;
		B a2 = (B)a;
		B b = a2;
		A b2 = (A)b;
		
		System.out.println(a1 instanceof A);
		System.out.println(a1 instanceof B);
		System.out.println(b1 instanceof A);
		System.out.println(a1 instanceof C);
		System.out.println(c1 instanceof A);
		
		
		
	}

}
