/* 학습내용
 * 1. 값비교
 * 	1. 참조
 * 		1. 주소값
 * 			- 동일한 객체
 * 			- ==
 * 		2. 객체 보유 내용값
 * 			- 타입만 동일한 경우 다른 객체라 하더라도 보유하고 있는 데이터가 동일한지를 비교
 * 			- equals()
 * 
 *	2. 기본 타입 데이터
 *		- == -- 주소값이 없기 때문에 순수한 값만 비교
 *
 *	3. String의 equals()
 *		- Object 클래스의 주소값 비교 로직을 재정의를해서 서로 다른 객체이긴 하나 내용만 동일하다면  true
 *
 *	4. java.lang.Object의 equals()
 *		- public boolean equals(Object o){
 *			객체의 주소 비교
 *		}
 *
 *	5. java.lang.String의 equals()
 *		- 재정의
 *		- public boolean equals(Object o){
 *			동일한 타입인 경우 서로 다른 객체라 하더라도 객체의 멤버변수(데이터)들 비교시 true or false
 *		}
 * 
 */
package step04.override;

public class EqualsTest {

	public static void main(String[] args) {
		Person p1 = new Person("현민", 28);
		Person p2 = new Person("현민", 28);
		Person2 p3 = new Person2("현민", 28);
		Person2 p4 = new Person2("현민", 28);
		Parent5 p5 = new Parent5();
		System.out.println(p1.equals(p3));//true 가 출력되게 재정의하기
		System.out.println(p3.equals(p4));//true 가 출력되게 재정의하기
		System.out.println(p3.equals(p1));//true 가 출력되게 재정의하기
		System.out.println(p5.equals(p1));//true 가 출력되게 재정의하기
	}	

}

class Parent5{
	
}
class Person2 extends Person{
	String name;
	int age;
	public //자식은 부모가될수있다
    boolean equals(Object o) {
	if(o instanceof Person2 && name.equals(((Person) o).name) && age == ((Person) o).age) {
		return true;
	}else {
		return false;
	}
	
}
	
public Person2(String name, int age) {
		super("현민",28);
		this.name = name;
		this.age = age;
		
		
	}
	
}

class Person extends Parent5 {
	String name;
	int age;
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}

	public //자식은 부모가될수있다
	       boolean equals(Object o) {
		if(o instanceof Person && name.equals(((Person) o).name) && age == ((Person) o).age) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
/* equals() 재정의
 * 1. Person 타입에 한해서 - instanceof
 * 2. 동일한 타입인 경우 - instanceof
 * 3. 멤버 변수들값 비교 - 참조타입 equals()/ 기본타입 ==, 상속받지 않은 멤버 호출시 반드시 형변환 필수
 * 4. 다 동일한다면? true
 * 		다르다면? false
 * 
*/
