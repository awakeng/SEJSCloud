//코드로 보는 자바의 상속관계
/* 필수 암기 사항
 * 1. 객체 생성 - instance
 *  : heap이라는 메모리에 사용가능하게 멤버 변수들 생성
 * 2. Parent 생성자 실행 완료
 *  : Parent 객체 생성, name과 age변수를 사용 가능하게 생성
 * 3. Child는 Parent 상속
 * 
 */

package step02.oop;

class Parent extends Object{
	String name;
	int age;
	
	Parent(){
		super();
		System.out.println("부모");
	}
	void printAll() {
		System.out.println(name);
		System.out.println(age);
	}
}

public class Child extends Parent{
	String job;
	public Child() {
		super(); // -- 바로위의 부모클래스의 생성자로 이동
		System.out.println("자식");
	}
	//재정의 overriding/override -반환타입 이름 변경불가
	void printAll() { 
		//System.out.println(name);
		//System.out.println(age);
		super.printAll();
		System.out.println(job);
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.name = "박현민";
		c.age = 28;
		c.job = "막강 파워 IT man";
				
	}

}
