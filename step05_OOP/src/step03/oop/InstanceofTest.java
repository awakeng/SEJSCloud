/* �н�����
 * 1. �����
 * 	- ��ü Ÿ�� �� �����
 *  - ��������
 *  	: ��� ������ ������ ���Ŀ� ����
 *  	: ������ ���� ����� Ÿ�� �� �ǹ� ����
 * 2. ����� �����Ǹ� ������ ��ü ����
 * 
 */

package step03.oop;

class A{}
class B extends A{
	String name = "daf";
	int a = 16;
}
class C extends A{}

public class InstanceofTest {

	//? BŸ���� ���� C Ÿ���� ��쿡 ó�� ������ �Ϻ� �ٸ��� ������ �޼ҵ��� ���
	public void m(A data) {//m(new A()); m(new B()); m(new C());
		//...
		if(data instanceof A) {
			//A������ ���ؼ� ó�� 
		}else if(data instanceof B) {
			//B���� �������� ó��
		}else if(data instanceof C) {
			//C���� �������� ó��
		}else {
			//�ٸ� Ÿ���� ��쿡 ó�� 
		}
		//��� Ÿ�� �������
	}
	
	public void m2(C data) {//m(new A()); m(new B()); m(new C());
		//...
		if(data instanceof A) {
			//A������ ���ؼ� ó�� 
		//}else if(data instanceof B) {
			//B���� �������� ó��
		}else if(data instanceof C) {
			//C���� �������� ó��
		}else {
			//�ٸ� Ÿ���� ��쿡 ó�� 
		}
		//��� Ÿ�� �������
	}	
			
			
			
	
	
	public static void main(String[] args) {
		//�θ�Ÿ�� ������ �ڽ����� ����°� ����
		//�ڽ�Ÿ�� ������ �θ�� ����°� �Ұ���
		//A a1 = new B();
		A a2 = new A();
		
		System.out.println(a2 instanceof A);//true
		System.out.println(a2 instanceof B);//f
		System.out.println(a2 instanceof C);//t
		
		
		//System.out.println(a1 instanceof A);//true
		//System.out.println(a1 instanceof B);//t
		//System.out.println(a1 instanceof C);//false
		
		System.out.println("===============");
		B b = new B();
		//b.name.i;
		//b.Math.sqrt(16);
		System.out.println(b instanceof A);//t
		System.out.println(b instanceof B);//t
		//System.out.println(b instanceof C);//����
	}
	
}



