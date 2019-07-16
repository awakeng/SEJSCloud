package baemin.service;

import java.util.ArrayList;

import baemin.exception.Log4j;
import baemin.exception.NotExistException;
import baemin.model.BaeminVirtualDB;
import baemin.model.dto.BaeminCustomerInfo;
import baemin.model.dto.LastInfo;
import baemin.model.dto.NewInfo;
import baemin.model.dto.OrderInfo;
import net.sf.json.JSONArray;

public class BaeminCustomerInfoService {

	private static BaeminCustomerInfoService instance = new BaeminCustomerInfoService();
	private BaeminVirtualDB baeminVirtualData = BaeminVirtualDB.getInstance();
	Log4j FailM = new Log4j();

	private BaeminCustomerInfoService() {
	}

	public static BaeminCustomerInfoService getInstance() {
		return instance;
	}

	// ��� ��list ��ȯ
	public ArrayList<BaeminCustomerInfo> getAllList() {
		return baeminVirtualData.getCustomertList();

	}

	// �� �˻�
	public BaeminCustomerInfo getCustomerInfo2(String customerid) throws NotExistException {
		BaeminCustomerInfo info = getCustomerInfo(customerid);
		if (info == null) {
			FailM.getInstance().error("error try : ����");
			throw new NotExistException("�˻� ��û�Ͻ� ID�� �������� �ʽ��ϴ�.\n");

		}
		return info;
	}

	public BaeminCustomerInfo getCustomerInfo(String customerid) {
		BaeminCustomerInfo info = null;
		ArrayList<BaeminCustomerInfo> v = baeminVirtualData.getCustomertList();
		int count = v.size();
		for (int i = 0; i < count; i++) {
			if (v.get(i).getId().equals(customerid)) {
				info = v.get(i);
			}
		}
		return info;
	}

	// �� �߰�
	public void CustomerInsert(BaeminCustomerInfo info) {
		baeminVirtualData.insertCustomer(info);
	}

	// �� ���� ���� - ������Ʈ ������ ��� ����� ����
	public void customerUpdate(String customerid, OrderInfo orderinfo) throws NotExistException {
		BaeminCustomerInfo info = getCustomerInfo(customerid);
		if (info == null) {
			FailM.getInstance().error("error try : ����");
			throw new NotExistException("xxxxxxx �����ϰ��� �ϴ� �������� �� �����մϴ�. xxxxxxx\n");
		}
		if (orderinfo instanceof NewInfo) {
			info.setNewinfo((NewInfo) orderinfo);
		} else if (orderinfo instanceof LastInfo) {
			info.setLastinfo((LastInfo) orderinfo);
		} else {
			FailM.getInstance().error("error try : ����");
			throw new NotExistException("xxxxxxx �����ϰ��� �ϴ� ������ �ùٸ��� �ʽ��ϴ�. xxxxxxx\n");
		}
	}

	// ������ ����
	public void customerDelete(String customerid) throws NotExistException {
		BaeminCustomerInfo info = getCustomerInfo(customerid);
		if (info == null) {
			FailM.getInstance().error("error try : ����");
			throw new NotExistException("xxxxxxx �����ϰ��� �ϴ� �������� �� �����մϴ�. xxxxxxx\n");
		}
		baeminVirtualData.getCustomertList().remove(info);
	}

	// ����� �߰�
	public void insertCustomerGrade(ArrayList<BaeminCustomerInfo> customer) {
		ArrayList<BaeminCustomerInfo> v = baeminVirtualData.getCustomertList();
		int count = v.size();
		for (int i = 0; i < count; i++) {
			int number = v.get(i).getCustomerinfo().getAmount();
			if (number <= 5) {
				v.get(i).setGrade("Silver");
			} else if (number > 5 && number <= 10) {
				v.get(i).setGrade("Gold");
			} else if (number > 10 && number <= 15) {
				v.get(i).setGrade("VIP");
			} else if (number > 15) {
				v.get(i).setGrade("VVIP");
			}

		}
	}

	// ����� �˻�
	public BaeminCustomerInfo searchGrade(String grade) throws NotExistException {
		ArrayList<BaeminCustomerInfo> v = baeminVirtualData.getCustomertList();
		BaeminCustomerInfo info = null;
		int count = v.size();
		for (int i = 0; i < count; i++) {
			if (v.get(i).getGrade().equals(grade)) {
				info = v.get(i);
			}
		}
		if (info == null) {
			FailM.getInstance().error("error try : ����");
			throw new NotExistException("�˻� ��û�Ͻ� ID�� �������� �ʽ��ϴ�.\n");
		}
		return info;
	}

	// Ư�� ��� ȸ�� ��� �˻�
	public ArrayList<BaeminCustomerInfo> searchAllGrade(String grade) throws NotExistException {
		ArrayList<BaeminCustomerInfo> v = baeminVirtualData.getCustomertList();
		ArrayList<BaeminCustomerInfo> v1 = baeminVirtualData.getGradeList();
		BaeminCustomerInfo info = null;
		int count = v.size();
		for (int i = 0; i < count; i++) {
			if (v.get(i).getGrade().equals(grade)) {
				info = v.get(i);
				baeminVirtualData.getGradeList().add(info);
			}
		}
		if (info == null) {
			FailM.getInstance().error("error try : ����");
			throw new NotExistException("�˻� ��û�Ͻ� ID�� �������� �ʽ��ϴ�.\n");
		}
		return v1;
	}

	// ��� JSON ��ȯ
	public JSONArray jsonAllCast() {
		return JSONArray.fromObject(baeminVirtualData.getCustomertList());
	}

	// ���� JSON ��ȯ
	public JSONArray jsonCast(String customerid) throws NotExistException {
		BaeminCustomerInfo info = getCustomerInfo(customerid);
		if (info == null) {
			FailM.getInstance().error("error try : ����");
			throw new NotExistException("xxxxxxx ��ȯ�ϰ��� �ϴ� �������� �� �����մϴ�. xxxxxxx\n");
		}

		return JSONArray.fromObject(info);
	}

}
