package api;

import java.util.ArrayList;

import model.domain.Customer;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("string"); // index 0��° �ڵ�����
		al.add(new Customer("tester", "77" , "vvip")); // index 1��° �ڵ�����
		al.add("a");
		al.add("b");
		al.add("c");
		System.out.println(al.size()); //al.toString() --Customer���� ������ �Ǿ����� // ����� ���� ������ ���� Ȯ�� ������ �޼ҵ�
		System.out.println(al.get(0)); //String
		
		//Customer s = (Customer)al.get(0);
	//	System.out.println(s);
		
		al.remove("string");
		System.out.println(al.get(0)); //Customer("tester", "77" , "vvip")
		
		System.out.println("--------------------------");
		//���׸� �ݿ��ؼ� ArrayList ���� ������ Ÿ�� ����
		ArrayList<String> al2 = new ArrayList<>();//String�� ���尡���� ArrayList
		al2.add("dfj");
		al2.add("1234");
		al2.add("��������");
		al2.add("12av����");
		//al2.add(new Customer()); ����
		String v = al2.get(0); // -- ����ȯ�� ���� �ʾƵ� ��
		System.out.println(v);
		
		
		//wrapper class[autoboxing, unboxing]
		//�⺻���� �����ؼ� ��üȭ�ϴ� �����̱� ������ wrapper��� ���� ��
		/* �⺻ 8������ ����� Ŭ���� : java.lang.package�� ����� Ŭ������
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
/* ����
 * 1. ArrayList ��ü ���� - �޸� ����
 * 2. public boolean add(Object o){} --String �̴� Customer�� Object�� �����
 * 	- ���� �޼ҵ�
 * 	- index 0���� ���������� ����, �������� ���� ���� �迭ó�� index
 * 3. public Object get(int index){}
 * 	- ��ȯ �޼ҵ�
 * 4. public boolean remove(Object o){}
 *   public boolean remove(int index){}
 *  - ����
 */