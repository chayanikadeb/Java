package java_basic_0;

public class Mathods {

	public static void main(String[] args) {
		 int first = 10;
		    int second = 20;
		    int third = 5;
		    
		    System.out.println(first + " " + second+ " " + third);

		    // add two numbers
		    int sum= calc(first,second);
		   // int sum = first + second + third;
		    System.out.println("The sum is: " + sum);
		   
	}

	
	 private static int calc(int first, int second) {
		// TODO Auto-generated method stub
		int returnSum;
		returnSum = first+second;
		return returnSum;
		
	}


	
}
