package model.Student;

import java.time.LocalTime;  

public class Student {
	
	private String name;
	static int a;
	static int b;
	static int c;
	static int d;
	private static LocalTime intime = LocalTime.of(a,b); 
 
	private static LocalTime outtime = LocalTime.of(c,d); 
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalTime getIntime() {
		return intime;
	}

	public static void setIntime(LocalTime intime) {
		Student.intime = intime;
	}

	public  LocalTime getOuttime() {
		return outtime;
	}

	public static void setOuttime(LocalTime outtime) {
		Student.outtime = outtime;
	}
	
	public Student(String name, LocalTime intime, LocalTime outtime) {
		this.name = name;
		this.intime = intime;
		this.outtime = outtime;
		
	}
	public String Result() {
		return name ;
}
	
}