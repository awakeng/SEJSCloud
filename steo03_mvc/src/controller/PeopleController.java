/* crud�� ��� ��û�� �ް� ��û ó�� ���� �� ������� EndView���� ��� �����ϴ� ����
 * �ϳ��� �޼ҵ忡�� if �б⹮���� ���� ����
 * StartView.java���� Controller���� ��û��
 * �б⹮�� ���� �� �����ͷ� ��û
 * 1 - ��� �˻�, 2 - ���� �˻�(�̸�), 3 - ����(����), 4-����, 5-����(name�� �������� age�� ����)
 */
package controller;

import model.PeopleModel;
import model.domain.People;
import view.EndView;

public class PeopleController {
	public static void request(int reqNumber) {
		if(reqNumber == 1) {
			
			EndView.printAll(PeopleModel.getAll());
			
		}else if(reqNumber == 2) {
			
			EndView.printInfo(PeopleModel.getInfo("������"));
		
		}else if(reqNumber == 3) {
			boolean r = PeopleModel.insert(new People("encoreMan",20));
			if(r) {
				EndView.printSuccess("���� ����");
			}else {
				EndView.printFail("���� ����");
			}
		}else if(reqNumber == 4) {
				PeopleModel.delete("encoreMan");
		}else if(reqNumber == 5) {
				PeopleModel.modify("������");
				
		}else {
			EndView.printFail("��û�Ͻ� ������ ���� �� �� �����ϴ�");

		}
		
	}

}