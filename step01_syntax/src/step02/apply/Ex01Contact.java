package step02.apply;

public class Ex01Contact {

	//�̸�(name),�ּ�(address),��ȣ(pnumber), ����(age)
	String name;
	String address;
	String pnumber;
	int age;
	
	Ex01Contact(){}
	
	//������ �Է�, ������ ����, ������ ���
	
	void addAge(int addAge) {
		age = addAge + age;
	}
	
	void getName(){
		System.out.println("�̸� : " + this.name);

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

		Contact.name = "������";
		Contact.age = 27;		
		Contact.pnumber = "010-1234-5678";
		Contact.address = "���빮��";
		
		Contact.getName();
		System.out.println("���� : " + Contact.getAge());
		System.out.println("��ȣ : " + Contact.getPnumber());
		System.out.println("�ּ� : " + Contact.getAddress());
		System.out.println();

		Ex01Contact Contact2 = new Ex01Contact();
		
		Contact2.name = "������";
		Contact2.age = 25;		
		Contact2.pnumber = "010-5678-1234";
		Contact2.address = "��õ��";
		
		Contact2.getName();
		System.out.println("���� : " + Contact2.getAge());
		System.out.println("��ȣ : " + Contact2.getPnumber());
		System.out.println("�ּ� : " + Contact2.getAddress());
		System.out.println();
		
		System.out.println("��� ���� : " + (Contact.getAge()+Contact2.getAge())/2 );
		Contact.addAge(1);
		Contact2.addAge(1);
		System.out.println("���� ��� ���� : " + (Contact.getAge()+Contact2.getAge())/2 );
		
	}
	
	

}
