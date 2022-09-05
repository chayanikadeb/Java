
import java.io.Console; 
import java.util.Scanner; 
import java.util.concurrent.Semaphore; 
import java.util.concurrent.locks.Condition; 
import java.util.concurrent.locks.Lock; 
import java.util.concurrent.locks.ReentrantLock;
public class Sujoy_1 {

	public static void main(String[] args) {
		// Get Website for this solution :https://www.java67.com/2014/06/write-program-to-find-sum-of-digits-in-java.html
		Scanner sc = new Scanner(System.in); 
		System.out.println("Please enter a number to calculate sum of digits"); 
		int number = sc.nextInt();
		// user imput 123  output =6 (1+2+3)
		int sum = 0; 
		int input = number;
		while (input != 0) 
		{ int lastdigit = input % 10; 
		sum += lastdigit; input /= 10;
		}

		System.out.printf("Sum of digits of number %d is %d", number, sum);
		
		sc.close();





		//store the imput  in string 

		// get lenth of string

		// forloop calcutate the value 
		// Print the final value 
	}

}
