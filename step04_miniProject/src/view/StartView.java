package view;

import java.time.LocalTime;
import controller.StudentController;

public class StartView {

	public static void main(String[] args) {
		System.out.println("---�⼮---");
		StudentController.request(1);
		System.out.println("---����---");
		StudentController.request(2);
		System.out.println("---����---");
		StudentController.request(3);
		System.out.println("---�Ἦ---");
		StudentController.request(4);
		System.out.println("---���� �ʿ�---");
		StudentController.request(5);
		System.out.println(LocalTime.now());
	}
}
