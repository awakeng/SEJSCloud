package step01;

import exception.NotAdminException;

public class ExceptionTest3 {
	/* id�� ���� �� admin�� �ƴ� ��� NotAdminException �߻�
	 * ����� �� 1 : ���� - admin�� ���
	 * ����� �� 2 : ������ - admin�� �ƴ� ���
	 * 			NotAdminException �߻�(��ü �����ؼ� throw)
	 */
	
	
	public static void idCheck(String id) throws NotAdminException {
		if(!id.equals("admin")) {
			throw new NotAdminException("admin�� �ƴѵ� �� ���� �õ��Ϸ� �ϴ���? ��?");
		}
		System.out.println("�ȳ��ϼ��� �����ڴ�");
	}

	public static void main(String[] args) {
		//admin ���� ��û
		/* ���� ����� ����� �� 1 - ����
		/* ���� ����� ����� �� 2 - ������
		 * 		:NotAdminException ��ü�� ���� -> ���� ó�� ���� �ʼ�	
		 */
		try {
			idCheck("admin");
		}catch(NotAdminException e) {
			e.printStackTrace();
		}
		
		System.out.println("-------------");
		
		try {
			idCheck("adfdh");
		}catch(NotAdminException e) {
			e.printStackTrace();
		}
		
		
	}

}
