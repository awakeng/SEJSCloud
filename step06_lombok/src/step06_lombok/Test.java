package step06_lombok;

import lombok.Data;

@Data
public class Test {
	
	private String name = "lombok";
	private int age;
	
	
	

}

/* 개발자 코드 : 실제 구동되는 코드 다름
 * 	- 대리자 코드 자동 생성(proxy)
 * 	- get/setXxx() 생성된 코드 확인하는법
 * 
*/
