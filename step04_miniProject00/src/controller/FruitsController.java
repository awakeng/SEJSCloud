package controller;

import log.check.Log4J;
import model.FruitsModel;
import model.domain.Fruits;
import view.EndView;

public class FruitsController {
	
	static Log4J log = Log4J.getInstance();
	
	public static void controller(int request) {
		
			//��ü �˻�
		if(request == 1){  
			System.out.println(log.now());
			EndView.printAll(FruitsModel.getAll());
			
			//���� �˻�
		}else if(request == 2){	
			EndView.printInfo(FruitsModel.getOne("����"));
			
			//����
		}else if(request == 3){ 
			System.out.println(log.disappear());
			FruitsModel.delete("�ڵ�");
			
			//���� �԰�
		}else if(request == 4){ 
			System.out.println(log.upDateInven());
			FruitsModel.edit("����", 30);
			
			//ǰ�� �԰�
		}else if(request == 5){	
			System.out.println(log.upDate());
			FruitsModel.insert(new Fruits("�ڵ�", 75));
			
			//���� ��� �̻� �˻�
		}else if(request == 6){	
			EndView.PrintInven(FruitsModel.checkInven(60));
		}
	}
}