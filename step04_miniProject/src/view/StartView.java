package view;

import java.time.LocalTime;
import controller.StudentController;

public class StartView {

	public static void main(String[] args) {
		System.out.println("---출석---");
		StudentController.request(1);
		System.out.println("---지각---");
		StudentController.request(2);
		System.out.println("---조퇴---");
		StudentController.request(3);
		System.out.println("---결석---");
		StudentController.request(4);
		System.out.println("---조사 필요---");
		StudentController.request(5);
		System.out.println(LocalTime.now());
	}
}
