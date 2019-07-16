package baemin.view;

import java.util.ArrayList;

import baemin.exception.NotExistException;
import baemin.model.dto.BaeminCustomerInfo;
import net.sf.json.JSONArray;

public class EndView {

	// ��� ��list���
	public static void printAll(ArrayList<BaeminCustomerInfo> customerlist) {
		for (BaeminCustomerInfo v : customerlist) {
			if (v == null) {
				new NotExistException();
			}
			System.out.println(v);
		}
	}

	// Ư�� ������Ʈ ���
	public static void customerView(BaeminCustomerInfo info) {
		System.out.println(info);
	}

	// ���ܰ� �ƴ� �ܼ� �޼��� ���
	public static void messageView(String message) {
		System.out.println(message);
	}

	// Ư�� ��� �� ���
	public static void gradeView(BaeminCustomerInfo info) {
		System.out.println(info);
	}

	// Ư�� ��� �� ��� ���
	public static void allGradeView(ArrayList<BaeminCustomerInfo> customerlist) {
		for (BaeminCustomerInfo v : customerlist) {
			if (v == null) {
				new NotExistException();
			}
			System.out.println(v);
		}
	}

	// ��� JSON ���
	public static void jsonAllView(JSONArray jsonproject) {
		System.out.println(jsonproject);
	}

	// ���� JSON ���
	public static void jsonView(JSONArray jsonproject) {
		System.out.println(jsonproject);
	}

}
