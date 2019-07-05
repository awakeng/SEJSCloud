package view;

import model.Student.Student;

public class EndView {

	public static void printAttend(String name) { 
			if(name != null) {
				System.out.println(name);
			}
		}
	
	public static void printLate(String info) {
		System.out.println(info);
	}
	public static void printEarly(String info) {
		System.out.println(info);
	}
	public static void printAbsent(String info) {
		System.out.println(info);
	}
	public static void printRequired(String info) {
		System.out.println(info);
	}
}
