package baemin.controller;

import java.util.ArrayList;

import baemin.exception.NotExistException;
import baemin.model.dto.BaeminCustomerInfo;
import baemin.model.dto.OrderInfo;
import baemin.service.BaeminCustomerInfoService;
import baemin.view.EndView;
import baemin.view.FailView;

public class BaeminController {

	private static BaeminController instance = new BaeminController();
	private BaeminCustomerInfoService service = BaeminCustomerInfoService.getInstance();

	private BaeminController() {
	}

	public static BaeminController getInstance() {
		return instance;
	}

	// ��� ��list ��� ���
	public void customerAllList() {
		EndView.printAll(service.getAllList());
	}

	// Ư�� �� �˻�
	public void viewCustomer(String customerid) {
		try {
			EndView.customerView(service.getCustomerInfo2(customerid));
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}

	}

	// ���ο� �� ����
	public void insertCustomer(BaeminCustomerInfo newCustomer) {
		service.CustomerInsert(newCustomer);
	}

	// �����ϴ� �� ����
	public void updateCustomer(String customerid, OrderInfo info) {
		try {
			service.customerUpdate(customerid, info);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}
	}

	// ��� �� ����
	public void deleteCustomer(String customerid) {
		try {
			service.customerDelete(customerid);
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}
	}

	// ��� JSON ��� ���
	public void allCastJson() {
		EndView.jsonAllView(service.jsonAllCast());
	}

	// ���� JSON ��� ���
	public void CastJson(String customerid) {
		try {
			EndView.jsonView(service.jsonCast(customerid));
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}
	}

	// �� ��� �߰� ���
	public void gradeInsert(ArrayList<BaeminCustomerInfo> customer) {
		service.insertCustomerGrade(customer);
	}

	// �� ��� ��� ���

	public void gradePrint(String grade) {
		try {
			EndView.gradeView(service.searchGrade(grade));
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}
	}

	// �� ��� ��� ��� ���
	public void allGradePrint(String grade) {
		try {
			EndView.allGradeView(service.searchAllGrade(grade));
		} catch (NotExistException e) {
			FailView.failMessageView(e.getMessage());
		}
	}

}
