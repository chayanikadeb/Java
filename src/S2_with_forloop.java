
import java.util.Scanner; 
// Reference website :https://www.javatpoint.com/sum-of-digits-of-a-number-in-java
public class S2_with_forloop  
{  
public static void main(String arg[])  
{  
long number, sum;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter a number: ");  
//reads a long number from the user  
number=sc.nextLong();  
//executes until the condition number!=0 becomes false  
for(sum=0; number!=0; number=number/10)  
{  
//finds the last digit and add it to the variable sum      
sum = sum + number % 10;  
}  
//prints the result  
System.out.println("Sum of digits: "+sum);  
}  
}  