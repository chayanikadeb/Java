package java_basic_0;

public class En2 {

	public static void main(String[] args) {
	
		Encapsulatio_1 En = new Encapsulatio_1();
		En.setId(5);
		En.setName("Jhon");
		En.setSalary(12000.56);
		
		System.out.println("ID is " + En.getId());
		System.out.println("Name is " + En.getName());
		System.out.println("Salary is " + En.getSalary());
	}

}
