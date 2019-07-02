/* 학습내용
 * 1. 변수
 *  1-1. 타입
 *  	1. 기본 - 소문자로만 되어있음
 *  		byte, short, int, long
 *  		float, double
 *  		char
 *  		boolean
 *  	2. 참조
 *  		- 기본을 제외한 모든 타입 - String 도 참조 타입
 *  1-2. 선언 위치에 따른 구분
 * 		1. 멤버
 * 			- class {} 하위
 * 		2. 로컬
 * 			- 생성자 또는 메소드의 parameter
 */

package step01;

import model.domain.People;

public class Ex03Variable {

	public static void main(String[] args) {
		//People 객체 생성 - new People()
		
		People person  = new People();
		People person2 = new People();
		
		//People에 "내 짝꿍 이름", -나이 대입, setXxx(값)
		
		person.setName("변영인");
		person.setAge(-27);
		
		person2.setName("유은나");
		person2.setAge(-25);		
		
		/* + 연산식
		 * 1. 숫자에 적용 : 산술 연산
		 * 2. 숫자 이외에 데이터에 적용 : 결합연산
		 * 
		 */
		
		
		//People의 getXxx() 호출해서 출력
		
		System.out.println(person.getAge());
		System.out.println(person.getName());

		System.out.println(person2.getAge());
		System.out.println(person2.getName());

		
		
		
	}

}




