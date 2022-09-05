import java.util.Scanner;

public class S_2 {

	public static void main(String[] args) {
		// user imput 123  output =6 (1+2+3)
		//store the imput  in string 
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please enter a number to calculate sum of digits"); 
		
		String input = sc.next();
		System.out.printf("Input "+input);
		int length = input.length() -1;
		int sum =0;
		
		for (int i=0;i<length ;i++)
		{
			//sum= sum+Integer.parseInt(input.charAt(i));
		}
		
	   System.out.printf("Sum of digits of number is %d",  sum);
		
		sc.close();

	}

}
