package step06_lombok;

import lombok.Data;

@Data
public class Test {
	
	private String name = "lombok";
	private int age;
	
	
	

}

/* ������ �ڵ� : ���� �����Ǵ� �ڵ� �ٸ�
 * 	- �븮�� �ڵ� �ڵ� ����(proxy)
 * 	- get/setXxx() ������ �ڵ� Ȯ���ϴ¹�
 * 
*/
