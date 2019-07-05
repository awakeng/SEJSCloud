package model.Student;

import java.time.LocalTime;

public class Student {
	
	private static Student instance = new Student();
	private Student () {}
	public static Student getInstance() {
		return instance;
	}

	private String name;
	int inhour;
	int inminute;
	int outhour;
	int outminute;
	private LocalTime intime = LocalTime.of(inhour, inminute);

	private LocalTime outtime = LocalTime.of(outhour, outminute);

	public Student(String name, LocalTime intime, LocalTime outtime) {
		this.name = name;
		this.intime = intime;
		this.outtime = outtime;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public  LocalTime getIntime() {
		return intime;
	}

	public void setIntime(LocalTime intime) {
		this.intime = intime;
	}

	public LocalTime getOuttime() {
		return outtime;
	}

	public void setOuttime(LocalTime outtime) {
		this.outtime = outtime;
	}

	public String Result() {
		return name;
	}

}