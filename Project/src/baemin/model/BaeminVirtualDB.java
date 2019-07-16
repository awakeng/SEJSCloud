package baemin.model;

import java.util.ArrayList;

import baemin.model.dto.BaeminCustomerInfo;
import baemin.model.dto.CustomerInfo;
import baemin.model.dto.LastInfo;
import baemin.model.dto.NewInfo;

public class BaeminVirtualDB {

	private static BaeminVirtualDB instance = new BaeminVirtualDB();
	private ArrayList<BaeminCustomerInfo> customerList = new ArrayList<BaeminCustomerInfo>();
	private ArrayList<BaeminCustomerInfo> gradeList = new ArrayList<BaeminCustomerInfo>();

	public BaeminVirtualDB() {
		customerList.add(new BaeminCustomerInfo("encore1",
				new NewInfo("01012345678", "BBQ ��籸��", "���ġŲ", "��õ", "�������"),
				new LastInfo("01012345678", "�Ƿ����� ��õ��", "�Ķ��̵�ġŲ", "����", "ī�����"),
				new CustomerInfo("¥���", "������", "����Ư���� ���Ǳ�", 3), null));

		customerList.add(new BaeminCustomerInfo("encore2", 
				new NewInfo("01056781234", "�������� ��õ��", "����", "��õ", "�������"),
				new LastInfo("01056781234", "���ҸӴϺ��� ��õ��", "����", "����", "������ü"),
				new CustomerInfo("«�Ϳ�", "������", "��⵵ ��õ��", 8), null));

		customerList.add(new BaeminCustomerInfo("encore3", 
				new NewInfo("01078945612", "�ڹ��� �λ���", "���", "�λ�", "��ġ�߰�"),
				new LastInfo("01078945612", "������ �λ���", "ȸ", "�λ�", "�޴�������"),
				new CustomerInfo("��������", "�Ӳ���", "�λ걤���� �߱�", 7), null));

		customerList.add(new BaeminCustomerInfo("encore4",
				new NewInfo("01078495162", "ȭ���", "����", "����", "�ܹ����߰�"),
				new LastInfo("01078495162", "�����ʹ�", "�ʹ�", "����", "�޴�������"), 
				new CustomerInfo("����", "���", "������ ������", 12),null));
	}

	public static BaeminVirtualDB getInstance() {
		return instance;
	}

	public ArrayList<BaeminCustomerInfo> getCustomertList() {
		return customerList;
	}

	public void insertCustomer(BaeminCustomerInfo newcustomer) {
		customerList.add(newcustomer);
	}

	public ArrayList<BaeminCustomerInfo> getGradeList() {
		return gradeList;
	}

	public void insertGradeList(BaeminCustomerInfo newcustomer) {
		gradeList.add(newcustomer);
	}

}
