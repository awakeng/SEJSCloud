package view;

import controller.PeopleController;

public class StartView {

	public static void main(String[] args) {
		/* 가정 : 모든 로직이 완벽하게 구현되었다 가정
		 * test하고자 하는 실행 순서
		 *  - 검색, 저장 -> 검색, 수정 또는 삭제 -> 검색
		 * 
		 * 현실 : 가입
		 * 
		 */
		System.out.println("-- 모든 검색 --");
		PeopleController.request(1);
		PeopleController.request(3);
		System.out.println("-- 저장 후 모든 검색 --");
		PeopleController.request(1);
		PeopleController.request(4);
		System.out.println("-- 삭제 후 모든 검색 --");
		PeopleController.request(1);
		System.out.println("-- 김종성 검색 --");
		PeopleController.request(2);
		System.out.println("-- 김종성 나이 추가 --");
		PeopleController.request(5);
		PeopleController.request(2);


		
		//.....
	}// 프로그램 완전 종료/메모리에 존재했던 모든것들이 없어짐

}
