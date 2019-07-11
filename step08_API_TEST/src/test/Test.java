package test;

import java.util.ArrayList;
import java.util.HashMap;
import net.sf.json.JSONArray;
import model.StudentModel;

public class Test {

	public static void main(String[] args) {
		
		
		
		System.out.println(StudentModel.getWhere(25));
		System.out.println("-----ArrayList 출력-----");
		System.out.println(StudentModel.student);
		System.out.println();
		System.out.println("-----ArrayList -json 변환-----");
		System.out.println(StudentModel.jsinfo1);
		System.out.println();
		System.out.println("-----ArrayList -json 데이터 추출-----");
		System.out.println(StudentModel.jsinfo1.get(0));
		System.out.println();
		System.out.println("-----HashMap 출력-----");
		System.out.println(StudentModel.student2);
		System.out.println();
		System.out.println("-----HashMap -json 변환-----");
		System.out.println(StudentModel.jsinfo2);
		System.out.println();
		System.out.println("-----HashMap -json 데이터 추출-----");
		System.out.println(StudentModel.jsinfo2.get("info")); //0 info 0
	}

}
