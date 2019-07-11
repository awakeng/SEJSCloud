package view;

import model.domain.People;

public class EndView {
	//��� ������ ���
	//? �� �迭�� Ư�� index�� ���� ���� ��, �����ϴ� ��ü�� ���� null�� ��쿣 ���� toString() ȣ�� �Ұ�
	//��� �ذ��Ұ��ΰ�?
	// People v ������ ���Թ����� �ִ� ����? new People([..]) , null
	
	public static void printAll(People[] all) {
		for(People v : all) {
			if(v != null) {
				System.out.println(v.toString());
			}
//			if(v == null) {
//			System.out.println("�ش� �̸��� ȸ���� �����ϴ�!");
//			return;
//			}
//			System.out.println(v.toString());
		}
	}	

	
	
	public static void printInfo(People v) {
		if(v != null) {
		System.out.println(v.toString());
		}else {
			System.out.println("�ش� �̸��� ȸ���� �����ϴ�!");
		}
	}

	public static void printSuccess(String msg) {
		System.out.println(msg);
	}

	public static void printFail(String msg) {
		System.out.println(msg);
	}

}
