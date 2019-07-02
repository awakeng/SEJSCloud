package step02.apply;

public class Ex01Contact {

	//이름(name),주소(address),번호(pnumber), 나이(age)
	String name;
	String address;
	String pnumber;
	int age;
	
	Ex01Contact(){}
	
	//데이터 입력, 데이터 수정, 데이터 출력
	
	void addAge(int addAge) {
		age = addAge + age;
	}
	
	void getName(){
		System.out.println("이름 : " + this.name);

	}
	
	int getAge(){
		return age;
	}
	
	String getPnumber() {
		return pnumber;
	}
	
	String getAddress() {
		return address;
	}
	
	public static void main(String[] args) {
		
		Ex01Contact Contact = new Ex01Contact();

		Contact.name = "변영인";
		Contact.age = 27;		
		Contact.pnumber = "010-1234-5678";
		Contact.address = "서대문구";
		
		Contact.getName();
		System.out.println("나이 : " + Contact.getAge());
		System.out.println("번호 : " + Contact.getPnumber());
		System.out.println("주소 : " + Contact.getAddress());
		System.out.println();

		Ex01Contact Contact2 = new Ex01Contact();
		
		Contact2.name = "김종성";
		Contact2.age = 25;		
		Contact2.pnumber = "010-5678-1234";
		Contact2.address = "부천시";
		
		Contact2.getName();
		System.out.println("나이 : " + Contact2.getAge());
		System.out.println("번호 : " + Contact2.getPnumber());
		System.out.println("주소 : " + Contact2.getAddress());
		System.out.println();
		
		System.out.println("평균 나이 : " + (Contact.getAge()+Contact2.getAge())/2 );
		Contact.addAge(1);
		Contact2.addAge(1);
		System.out.println("내년 평균 나이 : " + (Contact.getAge()+Contact2.getAge())/2 );
		
	}
	
	

}
