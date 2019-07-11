package step05.interfaceex;

public class NameInfoImpl implements NameInfo{
	
	public String getName() {
		return "김종성";
	}

	public static void main(String[] args) {
		//다형성
		NameInfo n = new NameInfoImpl();
		System.out.println(n.getName()); //인터페이스는 객체생성불가 -- 생성자가 없음
	}

}
