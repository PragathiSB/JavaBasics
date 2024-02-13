package ooopsExample;

public class MNCStudent extends Student implements ScoreInterface{


		// TODO Auto-generated method stub\
		public MNCStudent(String strName) {
			name=strName;
		}
		public void goToClass(){
			System.out.println("go to class afer colecting evals");
		}
		public double calculateScore()
		{
			return 6.0;
		}
		public int calculateAttendence()
		{
			return 8;
		}
		
	

}


