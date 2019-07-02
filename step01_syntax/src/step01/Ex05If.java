/* ����
 * 1. Ex04�� �ּ� ����
 * 2. ���� �� ���� �޼ҵ�, �� �� Ŭ�������� ��� ������ �������� ����
 *  - ��� ������ ���ٴ� ���� ��ü ���� �ǹ̰� ����
 *  - ���� ��� �޼ҵ�� static���� ��ü �������̵� ȣ�Ⱑ���� �������� ����
 * 3. ���� & ȣ��
 *  static ��ȯŸ�� �޼ҵ�([...]){[...]}
 *  - ȣ��
 *  	1. ������ Ŭ������ �޼ҵ�
 *  		�޼ҵ� ��([..]);
 *  		Ŭ������.�޼ҵ��([..]);
 *  
 *  	2. �ܺ� Ŭ������ �޼ҵ�
 *  		Ŭ������.�޼ҵ��([..]);
 *  		//������ Math.pow() ����
 * 
 * 4. ���ǽ� �н�
 *  - test ������(����) ����
 *  1. Ÿ���� Ȱ��
 *  	1. �⺻ Ÿ��
 *  	2. ���� Ÿ��(��üŸ��, object Ÿ��, reference Ÿ��)
 *  		- String Ÿ��
 *  		- java.lang.String
 *  		- java.lang�� �����ϰ� import ���̵� ��� ����
 *  		- �� �񱳽� String Ŭ�������� equals() �޼ҵ� ����
 *  			public boolean equals(String data){
 *  				�� �޼ҵ� �����ϰ� �ִ� String ��ü�� ���밪�� parameter�� ��
 *  				�����ϸ� true
 *  				�ٸ� ��� false
 *  			}
 *  
 *  2. �� ����
 *  	���� ��? ��� ��?
 * 
 * 
 * 
 */

package step01;

public class Ex05If {
	//parameter�� ���ԵǴ� �����ͷ� �޼ҵ� ���ο� ����� ���� �������� ���ؼ� boolean ��ȯ
	
	
	static boolean idCheck(String id) {
		String admin = "admin";
		if(admin.equals(id)) {
			return true;
		}else {
			return false;
		}
	}
	
	//�� ���ǰ� admin/admin2
	
	static boolean idCheck2(String id) {
		String admin = "admin";
		if(admin.equals(id)) {
			return true;
		}else if("admin2".equals(id)){
				return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(idCheck("m"));
		System.out.println(idCheck2("admin2"));
		
		/*// step 01
		String data = "encore";
		String data2 = "encore";
		boolean r = data.equals(data2);
		System.out.println(r);
		
		  // step 02
		String data = "encore";
		String data2 = "encore";
		System.out.println(data.equals(data2));*/
		
		  // step 03
		System.out.println("encore".equals("encore"));
	}

}


