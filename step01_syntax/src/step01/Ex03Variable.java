/* �н�����
 * 1. ����
 *  1-1. Ÿ��
 *  	1. �⺻ - �ҹ��ڷθ� �Ǿ�����
 *  		byte, short, int, long
 *  		float, double
 *  		char
 *  		boolean
 *  	2. ����
 *  		- �⺻�� ������ ��� Ÿ�� - String �� ���� Ÿ��
 *  1-2. ���� ��ġ�� ���� ����
 * 		1. ���
 * 			- class {} ����
 * 		2. ����
 * 			- ������ �Ǵ� �޼ҵ��� parameter
 */

package step01;

import model.domain.People;

public class Ex03Variable {

	public static void main(String[] args) {
		//People ��ü ���� - new People()
		
		People person  = new People();
		People person2 = new People();
		
		//People�� "�� ¦�� �̸�", -���� ����, setXxx(��)
		
		person.setName("������");
		person.setAge(-27);
		
		person2.setName("������");
		person2.setAge(-25);		
		
		/* + �����
		 * 1. ���ڿ� ���� : ��� ����
		 * 2. ���� �̿ܿ� �����Ϳ� ���� : ���տ���
		 * 
		 */
		
		
		//People�� getXxx() ȣ���ؼ� ���
		
		System.out.println(person.getAge());
		System.out.println(person.getName());

		System.out.println(person2.getAge());
		System.out.println(person2.getName());

		
		
		
	}

}




