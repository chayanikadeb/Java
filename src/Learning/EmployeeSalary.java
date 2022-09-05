package Learning;

import java.util.Scanner;

public class EmployeeSalary {
	
			
	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		//input.next();
		System.out.println("Put your employee hour rate:");
		double employeehourlyRate=input.nextDouble();
	//	double employeehourlyRate;
		double employeeWeeklyPay=employeehourlyRate*40;
		double employeeMonthlyPay= employeeWeeklyPay*4;
		double employeeYearlyPay=employeeMonthlyPay*12;
		
		
	
	   
	    System.out.println("employee Weekly Pay :" + employeeWeeklyPay);
	    System.out.println("employee Monthly Pay: "+ employeeMonthlyPay);
	    System.out.println("employee Yearly Pay : " +employeeYearlyPay);
	    

	}

}
