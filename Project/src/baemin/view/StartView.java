package baemin.view;

import baemin.controller.BaeminController;
import baemin.model.BaeminVirtualDB;
import baemin.model.dto.BaeminCustomerInfo;
import baemin.model.dto.CustomerInfo;
import baemin.model.dto.LastInfo;
import baemin.model.dto.NewInfo;

public class StartView {

	public static void main(String[] args) {

		BaeminVirtualDB db = BaeminVirtualDB.getInstance();
		BaeminController controller = BaeminController.getInstance();

		// ���ο� �ֹ�����
		NewInfo customer1 = new NewInfo("01074125896", "�ڹ��� õ����", "���", "õ��", "�żӹ��");
		// ���� �ֱ� �ֹ� ����
		LastInfo customer11 = new LastInfo("01074125896", "�޹в� �� ���ƿ�", "������", "õ��", "���ī�����");
		// ���ο� �� ����
		CustomerInfo customer111 = new CustomerInfo("������", "ȫ�浿", "��û�� õ�Ƚ�", 27);
		// ���ο� �� ���� ����Ʈ
		BaeminCustomerInfo newCustomer = new BaeminCustomerInfo("encore5", customer1, customer11, customer111, null);

		System.out.println("***** 0. �� ��� ���� ����*****");
		System.out.println("--- 0~5 Silver ---");
		System.out.println("--- 6~10 Gold ---");
		System.out.println("--- 11~15 VIP ---");
		System.out.println("--- 16�̻� VVIP ---");
		System.out.println();

		// ��� ������ �˻�
		System.out.println("***** 1. ������ ���� �� ��� ������ �˻�(��޹�����) *****");
		controller.customerAllList();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("***** 1 - 1. ������ ���� �� ��� ������ �˻� *****");
		controller.gradeInsert(db.getCustomertList());
		controller.customerAllList();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// ���ο� ������ ����
		System.out.println("***** 2. ���ο� ������ ���� ��  ��� ������ �˻� *****");
		controller.insertCustomer(newCustomer);
		controller.gradeInsert(db.getCustomertList());
		controller.customerAllList();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// �����ϴ� ������ �˻�
		System.out.println("***** 3. �����ϴ� ������ �˻� *****");
		controller.viewCustomer("encore3");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("***** 4. �������ϴ� ������ �˻� - ����ó�� Ȯ�ο� *****");
		controller.viewCustomer("������ó ---");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// �����ϴ� ������ ������Ʈ test
		System.out.println("***** 5. �����ϴ� ������ ���� �� ������ ������ �˻� *****");
		controller.updateCustomer("encore1", new NewInfo("01036985214", "BBQ ��籸��", "���ġŲ", "��õ", "�������"));
		controller.viewCustomer("encore1");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// �� �����ϴ� ������ ������Ʈ test : ���� �߻�
		System.out.println("***** 6. �������ϴ� ������ ���� - ����ó�� Ȯ�ο� *****");
		controller.updateCustomer("�����׷���--", new NewInfo("01036985214", "�Ƿ����� ��õ��", "���ġŲ", "��õ", "�������"));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		// ��� ������ �˻� �Ǵ� ������ ������ �˻�
		System.out.println("***** 7. ���� ���� �� �ش� ������ �˻� *****");
		controller.deleteCustomer("encore5");
		controller.viewCustomer("encore5");
		System.out.println();

		System.out.println("***** 8. JSON ��ȯ �� ������ �˻� *****");
		controller.allCastJson();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("***** 9. ���� JSON ��ȯ �� ������ �˻� *****");
		controller.CastJson("encore2");

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("***** 10. �߸��� ���� JSON ��ȯ *****");
		System.out.println();
		controller.CastJson("ensdkf");

		System.out.println("***** 11. Ư�� ��� �� ��� *****");
		System.out.println();
		System.out.println();
		controller.gradePrint("Silver");
		System.out.println();
		System.out.println();

		System.out.println("***** 12. Ư�� ��� �� ��� ��� *****");
		System.out.println();
		System.out.println();
		controller.allGradePrint("Gold");
	}

}
