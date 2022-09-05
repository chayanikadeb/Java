package Learning;

public class Scalculator {
	
	public static double salarycCalculater(double hourPerWeek, double hourRate, int unpaidtime) {
		 
		double employeeMonthlyPay = hourPerWeek * hourRate *4;
		return  employeeMonthlyPay - unpaidtime * hourRate ;
		
			
	}
  public static double yearlySalcalculator(double MonthlyPay ) {
	  double employeeYearlyPay = MonthlyPay;
	  return employeeYearlyPay= MonthlyPay*52;
	  
	  
  }
	public static void main(String[] args) {
		
		double Monthlysal=salarycCalculater(40,10,4);
		System.out.println("Monthly salary:" +Monthlysal);
		double yearlySal=yearlySalcalculator(Monthlysal);
		System.out.println("Yearly salary :" + yearlySal);

	}

}
