package model;

import java.time.LocalTime;
import model.Student.Student;

public class StudentModel {
	
	private static Student[] allData = new Student[10];
	
	static {
		allData[0] = new Student("������", LocalTime.of(8,50), LocalTime.of(18,10)); //�⼮
		allData[1] = new Student("������", LocalTime.of(8,51), LocalTime.of(18,01)); //�⼮
		allData[2] = new Student("�۽���", LocalTime.of(9,05), LocalTime.of(18,10)); //����
		allData[3] = new Student("������", LocalTime.of(9,10), LocalTime.of(16,40)); //����
		allData[4] = new Student("�赿��", LocalTime.of(8,50), LocalTime.of(16,50)); //�⼮
		allData[5] = new Student("������", LocalTime.of(8,10), LocalTime.of(18,10)); //�⼮
		allData[6] = new Student("�����", LocalTime.of(0,0), LocalTime.of(0,0));    //�Ἦ
		allData[7] = new Student("������", LocalTime.of(0,0), LocalTime.of(18,10));  //�����ʿ�
		allData[8] = new Student("������", LocalTime.of(8,57), LocalTime.of(18,10)); //�⼮
		allData[9] = new Student("�ּ���", LocalTime.of(9,10), LocalTime.of(0,0));   //�����ʿ�
	}
	
	
	//�⼮(9�� ���� / 18�� ����)
	public static String attend() {
		Student v = null;
		String name = null;
		for(int i = 0 ; i < allData.length ; i++) {
			v = allData[i];
			if(v.getIntime().isBefore(LocalTime.of(9,0)) && v.getOuttime().isAfter(LocalTime.of(18,0))
					&& v.getIntime() != null && v.getOuttime() != null) {
				name = v.getName();
				System.out.println(name);
			}
			
		} 
	return name;
	}

	public static String late() {
		Student v = null;
		String name = null;
		for(int i = 0 ; i < allData.length ; i++) {
			v = allData[i];
			if(v.getIntime().isAfter(LocalTime.of(9,0)) && v.getOuttime().isAfter(LocalTime.of(18,0))
				&& v.getIntime() != null && v.getOuttime() !=null	) {
				name = v.getName();
				System.out.println(name);
			}
			
		} 
	return name;
	}
	
	//����(������ / 18�� ����)
	public static String early() {
		Student v = null;
		String name = null;
		for(int i = 0 ; i < allData.length ; i++) {
			v = allData[i];
			if(v.getOuttime().isBefore(LocalTime.of(18,0))
				&& v.getIntime() != null && v.getOuttime() !=null) {
				name = v.getName();
				System.out.println(name);
			}
			
		} 
	return name;
	}
	
	//�Ἦ(both null)
	public static String absent() {
		Student v = null;
		String name = null;
		for(int i = 0 ; i < allData.length ; i++) {
			v = allData[i];
			if(v.getIntime() == LocalTime.of(0,0) && v.getOuttime() == LocalTime.of(0,0)) {
				name = v.getName();
				System.out.println(name);
			}
			
		} 
	return name;
	}
	
	//�����ʿ�( null && ������  or ������ && null)
	public static String required() {
		Student v = null;
		String name = null;
		for(int i = 0 ; i < allData.length ; i++) {
			v = allData[i];
			if(v.getIntime() == LocalTime.of(0,0) && v.getOuttime() != LocalTime.of(0,0) 
			 ||v.getIntime() != LocalTime.of(0,0) && v.getOuttime() == LocalTime.of(0,0)	) {
				name = v.getName();
				System.out.println(name);
			}
			
		} 
	return name;
	}
}

	
