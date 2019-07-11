package model;

import java.util.ArrayList;
import java.util.HashMap;
import net.sf.json.JSONObject;
import model.domain.Student;
import net.sf.json.JSONArray;

public class StudentModel {

	public static ArrayList<Student> student = new ArrayList<>();
	public static HashMap<String, ArrayList > student2 = new HashMap<>();
	
	static {
		student.add(new Student("박현민", 28, "군포"));
		student.add(new Student("김종성", 25, "부천"));
		student.add(new Student("유은나", 25, "서울"));
		
		student2.put("info", student);
	}
	
	public static JSONArray jsinfo1 = JSONArray.fromObject(student);
	public static JSONObject jsinfo2 = JSONObject.fromObject(student2);

	public static String getWhere(int age) {
		ArrayList<Student> v = null;
		String a = null;
		v = student;
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getNumber() == age) {
				a = v.get(i).getWhere();
				System.out.println(a);
			}
		}
		return "----- 완료";
	}
	
}
