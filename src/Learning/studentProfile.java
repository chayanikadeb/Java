package Learning;

public class studentProfile {

	
		
		String studentFirstName ;
		String StudentLastName;
		double Gpa;
		int ExpectedYeartoGraduate;
		
		public  studentProfile(String studentFirstName,String StudentLastName,double Gpa,int ExpectedYeartoGraduate) {
			
			this.studentFirstName=studentFirstName;
			this.StudentLastName=StudentLastName;
			this.Gpa=Gpa;
			this.ExpectedYeartoGraduate=ExpectedYeartoGraduate;
		}
		
		
		public void EncrimentExpectedYear() {
			
			this.ExpectedYeartoGraduate=this.ExpectedYeartoGraduate +1;
	
		
	}
	
	
	
}
