package log.check;

public class Log4J {
	
	private static Log4J instance = new Log4J();
	private Log4J(){}
	
	public static Log4J getInstance() {
		return instance;
	}
	
	public static String now() {
		return "---���� ��� �����Դϴ�---";
	}
	
	public static String upDateInven() {
		return "---���ο� ������ �԰�Ǿ����ϴ�---";
	}
	
	public static String upDate() {
		return "---���ο� ǰ���� �԰�Ǿ����ϴ�---";
	}
	
	public static String disappear() {
		return "---ǰ���� �����Ǿ����ϴ�---";
	}
}
