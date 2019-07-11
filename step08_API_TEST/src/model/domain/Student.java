package model.domain;

import lombok.Data;

@Data
public class Student {
	
	private String name;
	private int number;
	private String where;
	
	public Student(String name, int number, String where) {
		super();
		this.name = name;
		this.number = number;
		this.where = where;
	}
	

}
