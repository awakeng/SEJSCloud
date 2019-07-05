package controller;

import model.StudentModel;
import view.EndView;
import model.Student.Student;

public class StudentController {

		public static void request(int reqNumber) {
			
			if(reqNumber == 1 ) {
					EndView.printAttend(StudentModel.attend());
				
			/*}
			else if(reqNumber == 2 ) {
				EndView.printAttend(StudentModel.late("출석"))
			}
			else if(reqNumber == 3 ) {
				EndView.printAttend(StudentModel.early("출석"))
			}
			else if(reqNumber == 4 ) {
				EndView.printAttend(StudentModel.absent("출석"))
			}
			else if(reqNumber == 5 ) {
				EndView.printAttend(StudentModel.required("출석"))
			}
			else {
				
			}
			
		}*/
			}
		}
}
