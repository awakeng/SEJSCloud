package model.domain;

import model.Fruits;

public class FruitsModel {
	
	//��ü �˻�

	//���� �˻�
	
	//���� �߰�
		public static Fruits upDate(String name, int a) {
			Fruits v = null;
			for(int i=0; i<allData.length; i++) {
				v = allData[i];
				if(v.getName().equals(name)) {
					v.setInven(v.getInven() + a);
				}
			}return v;
		}
	//����
	
	//����

}
