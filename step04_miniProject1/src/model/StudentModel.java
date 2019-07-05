package model;

import java.time.LocalTime;
import model.Student.Student;

public class StudentModel {
	
	private static Student[] allData = new Student[10];
	
	static {
		allData[0] = new Student("박현민", LocalTime.of(8,50), LocalTime.of(18,10));
		allData[1] = new Student("김종성", LocalTime.of(8,51), LocalTime.of(18,01));
		allData[2] = new Student("강사님", LocalTime.of(9,10), LocalTime.of(18,10));
		allData[3] = new Student("조현희", null, LocalTime.of(18,20));
		allData[4] = new Student("김동성", LocalTime.of(8,50), LocalTime.of(16,50));
		allData[5] = new Student("변영인", null, null);
		allData[6] = new Student("송시찬", LocalTime.of(8,58), LocalTime.of(18,10));
		allData[7] = new Student("김진휘", LocalTime.of(8,50), LocalTime.of(18,01));
		allData[8] = new Student("남세영", LocalTime.of(8,57), null);
		allData[9] = new Student("최성국", LocalTime.of(9,10), LocalTime.of(18,10));
	}
	
	
	//출석(9시 이전 / 18시 이후)
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
	//지각(9시 이후/ 18시 이후)
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
	//조퇴(값존재 / 18시 이전)
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
	
	//결석(both null)
	public static boolean absent(Student v) {
		for(int i = 0 ; i < allData.length ; i++) {
			v = allData[i];
			if(	v.getIntime() == null && v.getOuttime() == null) {
				return true;
			}
		}
		return false;
	}
	
	//조사필요( null && 값존재  or 값존재 && null)
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
