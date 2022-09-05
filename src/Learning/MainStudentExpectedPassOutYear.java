package Learning;

public class MainStudentExpectedPassOutYear {

	public static void main(String[] args) {
		
		studentProfile profile1= new studentProfile("Sujoy","Deb",16.7,2021);
		studentProfile profile2= new studentProfile("Jim","D",19.0,2022);
		profile1.EncrimentExpectedYear();
		profile2.EncrimentExpectedYear();
	
		System.out.println(profile1.ExpectedYeartoGraduate);
		System.out.println(profile2.ExpectedYeartoGraduate);
		System.out.println(profile2.studentFirstName);
		
		
	}

}
