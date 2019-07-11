package model;

import model.domain.Fruits;

public class FruitsModel {
			
	public static Fruits[] allData = new Fruits[5];
	private static int index;
	
	public static Fruits[] invenData = new Fruits[100];
	
	static {
		allData[0] = new Fruits("����", 30);
		allData[1] = new Fruits("����", 100);
		allData[2] = new Fruits("������", 55);
		index=3;
	}
	
	//��ü �˻�
	public static Fruits [] getAll() {
		return allData;
	}
	
	//���� �˻�
	public static Fruits getOne (String name) {
		Fruits v = null;
		for(int i=0; i< allData.length; i++) {
			v = allData[i];
			if(v != null && v.getName().equals(name)) {
				return v;
			}
		}
		return v;
	}
	
	//���� �߰�
	public static Fruits edit(String name, int a) {
		Fruits v = null;
		for(int i=0; i<allData.length; i++) {
			v = allData[i];
			if(v != null && v.getName().equals(name)) {
				v.setInven(v.getInven() + a);
				return v;
			}
		}
		return v;
	}
	
	//�׸� �߰�
	public static boolean insert (Fruits v) {
		if (index <5) {
			allData[index++] = v;
			return true;
		}else {
			return false;
		}
	}
	
	//����
	public static Fruits delete(String name) {
		Fruits v = null;
		for(int i=0; i<allData.length; i++) {
			v = allData[i];
			if(v != null && v.getName().equals(name)) {
				return allData[i] = null;
			}
		}
		return v;
	}
	
	//���� ��� �̻� �˻�
	public static Fruits [] checkInven (int inven) {
		Fruits v = null;
		for(int i=0; i<allData.length; i++) {
			v = allData[i] ;
			if(v != null && inven <= v.getInven()) {
				invenData[i] = new Fruits (v.getName(),v.getInven());
			}
		}
		return invenData;
	}
}