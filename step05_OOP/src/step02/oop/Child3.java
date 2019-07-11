package step02.oop;

class Parent3 extends Object {
	String name;
	int age;
	
	Parent3() {
		super();
	}
	
	void printAll() {
		System.out.println(name);
		System.out.println(age);
	}
	
}

public class Child3 extends Parent3 {
	String job;
	
	public Child3() {
		super();
	}
	
	void printAll() {    //-- 새로만든게아니라 수정한것 / virtual method invocation
		super.printAll();
		System.out.println(job);
	}
	//다형성 적용된 메소드
	static Object m() {
		return "Str,ing";
	}
	
	static Object m2() {
		return "String,int,double,boolean";
	}
	
	String [] all2 = ((String)m2()).split(",");
	
	
	public static void main(String[] args) {
		Parent3 p = new Child3(); //컴파일 시점에는 부모쪽부터 먼저 접근
		p.printAll(); // 실행시점에는 자식쪽부터 먼저 접근
		String v = (String)m();
		//? g만 출력해보기
		System.out.println( ((String)m()).charAt(5)); // --먼저 연산되게끔 ()로 우선순위 표시
		
		//? m2() 반환값을 , 를 기준으로(구분자) 하나의 배열에 4개의 데이터가 저장되는 구조로 변환
		/* 작업단계
		 * 메소드의 반환값 받음 -> String 변환 -> 배열로 변환
		 * charAt()/length()/split()
		 * ? split()로 구분된 문자열들을 char [] 생성해서 저장
		 * 첫번째 index에 저장된 String이라는 문자열을 char 배열 생성해서 배열에 저장하기
		 */
		
		//String[] v2 = ((String)m2()).split;
		//System.out.println(v2.split(,));
		
		String [] all = ((String)m2()).split(",");
		for(String a : all) {
			System.out.println(a);
		}
		
		//char [] all2 = ((String)m2()).split(",")[0].toCharArray();
		//System.out.println(all2[0]);
		//System.out.println(all2.length);
		
		String data = all[0];
		
		char [] cArray = new char[data.length()];
		for(int i = 0; i < cArray.length; i++) {
			cArray[i] = data.charAt(i);
		}
		
		System.out.println("char[]의 데이터 출력해 보기");
		for(char v1 : cArray) {
			System.out.println(v1 + "\t");
		}
		
	}

}
