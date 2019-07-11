package api;

import java.util.ArrayList;

import model.domain.Customer;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("string"); // index 0번째 자동저장
		al.add(new Customer("tester", "77" , "vvip")); // index 1번째 자동저장
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println(al.size()); //al.toString() --Customer에서 재정의 되어있음 // 저장된 실제 데이터 개수 확인 가능한 메소드
		System.out.println(al.get(0)); //String
		
		//Customer s = (Customer)al.get(0);
	//	System.out.println(s);
		
		al.remove("string");
		System.out.println(al.get(0)); //Customer("tester", "77" , "vvip")
		
		System.out.println("--------------------------");
		//제네릭 반영해서 ArrayList 저장 데이터 타입 제한
		ArrayList<String> al2 = new ArrayList<>();//String만 저장가능한 ArrayList
		al2.add("dfj");
		al2.add("1234");
		al2.add("ㄱㅁㄴㄹ");
		al2.add("12avㄱㅁ");
		//al2.add(new Customer()); 오류
		String v = al2.get(0); // -- 형변환을 하지 않아도 됨
		System.out.println(v);
		
		
		//wrapper class[autoboxing, unboxing]
		//기본값을 포장해서 객체화하는 구조이기 때문에 wrapper라는 말을 씀
		/* 기본 8가지의 도우미 클래스 : java.lang.package에 내장된 클래스들
		 * int : Integer
		 * byte : Byte
		*/
		 ArrayList<Integer> al3 = new ArrayList<>();
		 al3.add(3); //al3.add(new Integer(3))
		 al3.add(new Integer(10));
		 
		 // = ( (Integer)al3.get(1) ).intValue();
		 int i3 = al3.get(1);
		 System.out.println(i3);
	}
	

}
/* 질문
 * 1. ArrayList 객체 생성 - 메모리 생성
 * 2. public boolean add(Object o){} --String 이던 Customer던 Object로 저장됨
 * 	- 저장 메소드
 * 	- index 0부터 순차적으로 저장, 데이터의 구분 또한 배열처럼 index
 * 3. public Object get(int index){}
 * 	- 반환 메소드
 * 4. public boolean remove(Object o){}
 *   public boolean remove(int index){}
 *  - 삭제
 */