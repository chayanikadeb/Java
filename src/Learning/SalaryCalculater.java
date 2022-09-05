package Learning;

public class SalaryCalculater {
	public static double EmpSalaryCalculater(double hourePerweek,double ammountPerhour) {
		double wheeklyPayCheck=hourePerweek * ammountPerhour;
		return wheeklyPayCheck * 52;
	}

	public static void main(String[] args) {
		double salary = EmpSalaryCalculater(40,15);
		System.out.println(salary);
	
	}

}
