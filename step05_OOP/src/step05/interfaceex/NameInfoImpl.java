package step05.interfaceex;

public class NameInfoImpl implements NameInfo{
	
	public String getName() {
		return "������";
	}

	public static void main(String[] args) {
		//������
		NameInfo n = new NameInfoImpl();
		System.out.println(n.getName()); //�������̽��� ��ü�����Ұ� -- �����ڰ� ����
	}

}
