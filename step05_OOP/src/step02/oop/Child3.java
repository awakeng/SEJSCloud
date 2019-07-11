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
	
	void printAll() {    //-- ���θ���Ծƴ϶� �����Ѱ� / virtual method invocation
		super.printAll();
		System.out.println(job);
	}
	//������ ����� �޼ҵ�
	static Object m() {
		return "Str,ing";
	}
	
	static Object m2() {
		return "String,int,double,boolean";
	}
	
	String [] all2 = ((String)m2()).split(",");
	
	
	public static void main(String[] args) {
		Parent3 p = new Child3(); //������ �������� �θ��ʺ��� ���� ����
		p.printAll(); // ����������� �ڽ��ʺ��� ���� ����
		String v = (String)m();
		//? g�� ����غ���
		System.out.println( ((String)m()).charAt(5)); // --���� ����ǰԲ� ()�� �켱���� ǥ��
		
		//? m2() ��ȯ���� , �� ��������(������) �ϳ��� �迭�� 4���� �����Ͱ� ����Ǵ� ������ ��ȯ
		/* �۾��ܰ�
		 * �޼ҵ��� ��ȯ�� ���� -> String ��ȯ -> �迭�� ��ȯ
		 * charAt()/length()/split()
		 * ? split()�� ���е� ���ڿ����� char [] �����ؼ� ����
		 * ù��° index�� ����� String�̶�� ���ڿ��� char �迭 �����ؼ� �迭�� �����ϱ�
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
		
		System.out.println("char[]�� ������ ����� ����");
		for(char v1 : cArray) {
			System.out.println(v1 + "\t");
		}
		
	}

}
