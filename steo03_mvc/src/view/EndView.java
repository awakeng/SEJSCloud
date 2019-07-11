package view;

import model.domain.People;

public class EndView {
	//모든 데이터 출력
	//? 단 배열의 특정 index의 값이 없는 즉, 참조하는 객체가 없는 null인 경우엔 절대 toString() 호출 불가
	//어떻게 해결할것인가?
	// People v 변수가 대입받을수 있는 값은? new People([..]) , null
	
	public static void printAll(People[] all) {
		for(People v : all) {
			if(v != null) {
				System.out.println(v.toString());
			}
//			if(v == null) {
//			System.out.println("해당 이름의 회원이 없습니다!");
//			return;
//			}
//			System.out.println(v.toString());
		}
	}	

	
	
	public static void printInfo(People v) {
		if(v != null) {
		System.out.println(v.toString());
		}else {
			System.out.println("해당 이름의 회원이 없습니다!");
		}
	}

	public static void printSuccess(String msg) {
		System.out.println(msg);
	}

	public static void printFail(String msg) {
		System.out.println(msg);
	}

}
