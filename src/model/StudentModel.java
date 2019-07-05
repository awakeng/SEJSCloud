package model;

import java.time.LocalTime;
import model.Student.Student;

public class StudentModel {
	
	private static Student[] allData = new Student[10];
	
	static {
		allData[0] = new Student("������", LocalTime.of(8,50), LocalTime.of(18,10));
		allData[1] = new Student("������", LocalTime.of(8,51), LocalTime.of(18,01));
		allData[2] = new Student("�����", LocalTime.of(9,10), LocalTime.of(18,10));
		allData[3] = new Student("������", null, LocalTime.of(18,20));
		allData[4] = new Student("�赿��", LocalTime.of(8,50), LocalTime.of(16,50));
		allData[5] = new Student("������", null, null);
		allData[6] = new Student("�۽���", LocalTime.of(8,58), LocalTime.of(18,10));
		allData[7] = new Student("������", LocalTime.of(8,50), LocalTime.of(18,01));
		allData[8] = new Student("������", LocalTime.of(8,57), null);
		allData[9] = new Student("�ּ���", LocalTime.of(9,10), LocalTime.of(18,10));
	}
	
	
	//�⼮(9�� ���� / 18�� ����)
	public static void String attend() {
		Student v = null;
		for(int i = 0 ; i < allData.length ; i++) {
			v = allData[i];
			if(v.getIntime().isBefore(LocalTime.of(9,0)) && v.getOuttime().isAfter(LocalTime.of(18,0))
				&& v.getIntime() != null && v.getOuttime() !=null ) {
				System.out.println(v.getName());	
			}
		}
	}
	//����(9�� ����/ 18�� ����)
	public static boolean late(Student v) {
		for(int i = 0 ; i < allData.length ; i++) {
			v = allData[i];
			if(v.getIntime().isBefore(LocalTime.of(9,0)) && v.getOuttime().isAfter(LocalTime.of(18,0))
				&& v.getIntime() != null && v.getOuttime() !=null	) {
				return true;
			}
		}
		return false;
	}
	//����(������ / 18�� ����)
	public static boolean early(Student v) {
		for(int i = 0 ; i < allData.length ; i++) {
			v = allData[i];
			if(v.getOuttime().isBefore(LocalTime.of(18,0))
				&& v.getIntime() != null && v.getOuttime() !=null	) {
				return true;
			}
		}
		return false;
	}
	
	//�Ἦ(both null)
	public static boolean absent(Student v) {
		for(int i = 0 ; i < allData.length ; i++) {
			v = allData[i];
			if(	v.getIntime() == null && v.getOuttime() == null) {
				return true;
			}
		}
		return false;
	}
	
	//�����ʿ�( null && ������  or ������ && null)
	public static boolean required(Student v) {
		for(int i = 0 ; i < allData.length ; i++) {
			v = allData[i];
			if(v.getIntime() == null && v.getOuttime() != null 
			 ||v.getIntime() != null && v.getOuttime() == null	) {
				return true;
			}
		}
		return false;
	}
	
	public static Student[] getAll() {
		return allData;
	}
}
