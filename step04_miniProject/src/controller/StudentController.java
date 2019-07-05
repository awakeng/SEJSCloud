package controller;

import model.StudentModel;
import view.EndView;


public class StudentController {

		public static void request(int reqNumber) {	
			if(reqNumber == 1 ) {
				EndView.printName(StudentModel.attend());
				}
			else if(reqNumber == 2 ) {
				EndView.printName(StudentModel.late());
			}
			else if(reqNumber == 3 ) {
				EndView.printName(StudentModel.early());
			}
			else if(reqNumber == 4 ) {
				EndView.printName(StudentModel.absent());
			}
			else if(reqNumber == 5 ) {
				EndView.printName(StudentModel.required());
			}
			else {
				
			}
			}
		}

