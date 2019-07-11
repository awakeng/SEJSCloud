//�ڵ�� ���� �ڹ��� ��Ӱ���
/* �ʼ� �ϱ� ����
 * 1. ��ü ���� - instance
 *  : heap�̶�� �޸𸮿� ��밡���ϰ� ��� ������ ����
 * 2. Parent ������ ���� �Ϸ�
 *  : Parent ��ü ����, name�� age������ ��� �����ϰ� ����
 * 3. Child�� Parent ���
 * 
 */

package step02.oop;

class Parent extends Object{
	String name;
	int age;
	
	Parent(){
		super();
		System.out.println("�θ�");
	}
	void printAll() {
		System.out.println(name);
		System.out.println(age);
	}
}

public class Child extends Parent{
	String job;
	public Child() {
		super(); // -- �ٷ����� �θ�Ŭ������ �����ڷ� �̵�
		System.out.println("�ڽ�");
	}
	//������ overriding/override -��ȯŸ�� �̸� ����Ұ�
	void printAll() { 
		//System.out.println(name);
		//System.out.println(age);
		super.printAll();
		System.out.println(job);
	}
	public static void main(String[] args) {
		Child c = new Child();
		c.name = "������";
		c.age = 28;
		c.job = "���� �Ŀ� IT man";
				
	}

}
