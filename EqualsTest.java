/* �н�����
 * 1. ����
 * 	1. ����
 * 		1. �ּҰ�
 * 			- ������ ��ü
 * 			- ==
 * 		2. ��ü ���� ���밪
 * 			- Ÿ�Ը� ������ ��� �ٸ� ��ü�� �ϴ��� �����ϰ� �ִ� �����Ͱ� ���������� ��
 * 			- equals()
 * 
 *	2. �⺻ Ÿ�� ������
 *		- == -- �ּҰ��� ���� ������ ������ ���� ��
 *
 *	3. String�� equals()
 *		- Object Ŭ������ �ּҰ� �� ������ �����Ǹ��ؼ� ���� �ٸ� ��ü�̱� �ϳ� ���븸 �����ϴٸ�  true
 *
 *	4. java.lang.Object�� equals()
 *		- public boolean equals(Object o){
 *			��ü�� �ּ� ��
 *		}
 *
 *	5. java.lang.String�� equals()
 *		- ������
 *		- public boolean equals(Object o){
 *			������ Ÿ���� ��� ���� �ٸ� ��ü�� �ϴ��� ��ü�� �������(������)�� �񱳽� true or false
 *		}
 * 
 */
package step04.override;

public class EqualsTest {

	public static void main(String[] args) {
		Person p1 = new Person("����", 28);
		Person p2 = new Person("����", 28);
		Person2 p3 = new Person2("����", 28);
		Person2 p4 = new Person2("����", 28);
		Parent5 p5 = new Parent5();
		System.out.println(p1.equals(p3));//true �� ��µǰ� �������ϱ�
		System.out.println(p3.equals(p4));//true �� ��µǰ� �������ϱ�
		System.out.println(p3.equals(p1));//true �� ��µǰ� �������ϱ�
		System.out.println(p5.equals(p1));//true �� ��µǰ� �������ϱ�
	}	

}

class Parent5{
	
}
class Person2 extends Person{
	String name;
	int age;
	public //�ڽ��� �θ𰡵ɼ��ִ�
    boolean equals(Object o) {
	if(o instanceof Person2 && name.equals(((Person) o).name) && age == ((Person) o).age) {
		return true;
	}else {
		return false;
	}
	
}
	
public Person2(String name, int age) {
		super("����",28);
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

	public //�ڽ��� �θ𰡵ɼ��ִ�
	       boolean equals(Object o) {
		if(o instanceof Person && name.equals(((Person) o).name) && age == ((Person) o).age) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
/* equals() ������
 * 1. Person Ÿ�Կ� ���ؼ� - instanceof
 * 2. ������ Ÿ���� ��� - instanceof
 * 3. ��� �����鰪 �� - ����Ÿ�� equals()/ �⺻Ÿ�� ==, ��ӹ��� ���� ��� ȣ��� �ݵ�� ����ȯ �ʼ�
 * 4. �� �����Ѵٸ�? true
 * 		�ٸ��ٸ�? false
 * 
*/
