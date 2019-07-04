package model;

import model.domain.People;

public class PeopleModel {
	//DB�� ���� �׽�Ʈ �����
	private static People[] allData = new People[5];
	private static int index;
	//test ������ ����
	//byte code�� �ε��ɶ� �ڵ����� ����Ǵ� Ưȭ�� �ڵ�
	static {
		allData[0] = new People("������" , 27);
		allData[1] = new People("������" , 25);
		allData[2] = new People("������" , 25);
		index = 3;
	}
	
	
	//���߽� PeopleModel�� �ܼ� Ȯ�ο� �� �����׽�Ʈ ������ ����, ���Ŀ� ���� ����
	public static void main(String [] args) {
		System.out.println(2);
	}
	
	
	//����
	/* ���߹��
	 * ����� �� 1 : name, age�� ���� argument�� �޾Ƽ� People��ü ���� �� �迭�� ����
	 * ����� �� 2 : People ��ü�� argument�� �޾Ƽ� �迭�� ����
	 */
	public static boolean insert(People v) {
		if(index < 5) {
			//alldata[index] = v;
			//index++;
			allData[index++] = v;
			return true;
		}else {
			return false;
		}
	
	}
	
	//����
	/* �߻� ������ ����� ��
	 * 1. ���� �����͸� ���� ��û
	 *  -
	 * 2. �����ϴ� ������ ���� ��û
	 *  - ����
	 *  - �����ÿ� �迭�� ���� ����
	 *   1. ������ index�� ������ ����
	 *   	- index : --
	 *   2. �߰� index�� �����ϴ� ������ ����	
	 *   	- 5���� �� ����Ǿ� ������ index 2�� ������ 3��° ���� ����
	 *   	 : index 2�� ������ ������ ������?
	 *   	 : index 2�� �⺻ default�� �Ұ�����?(����)
	 *   		- ��� ��� ���� �˻��� index 2������ �����͸� �����ϰ� ���
	 *   		- �߻� ������ ����� ��
	 *   		 	1. ����� ���� ��ü�� ���밪 Ȱ��(���) �õ��� ���� ���� �߻�
	 *   			2. �ڵ�� ���翩�� ���� �� ���
	 * 3. ���� : �̸����� ���� ��û 
	 *  - �̸��� �����ϴ��� Ȯ��
	 *   1. �迭�� �����͸� �ϳ��ϳ� ��ȯ�ؼ� �̸��� ��ȯ : �ݺ�
	 *   2. �迭�� �̸��� parameter�� ���Ե� �������� ��
	 *   3. ������
	 *   	- ���� �� true return
	 *   	- �ݺ�����
	 *   4. �������� ���� ��� �� ���°�쿣 false return
	 *   5. ���ǽ�1 && ���ǽ�2
	 *   	- �� ���ǽ� ��� true�� ��� �ش� {} ����
	 *   	- ����
	 *   		���ǽ�1 �� false�� ��� ������ {} ���� �� �Ұ��̱� ������ �ι�°
	 *   		���ǽ��� ���� ��ü�� ����
	 *   	- ���� ������
	 *   6. ���ǽ�1 && ���ǽ�2
	 *   	- ���ǽ� 1 �� false�� ��� ���ǽ�2�� ���� �� ��
	 *    */

	public static boolean delete(String name){
		People v = null;
		for(int i = 0 ; i < allData.length ; i++) {
			v = allData[i];
			if(v != null && v.getName().equals(name)) {//
				allData[i] = null;
				return true;
			}
		}
		return false;
	}
	
	//����
	
	
	
	
	
	//�ѻ�� ������ �˻�
	
	//��� ����� �˻�
	/* �ܼ��ϰ� �迭 ��ü�� ��ȯ - Controller�� �޾Ƽ�  View���� ����� ����*/
	public static People[] getAll() {
		return allData;
	}
	

}
