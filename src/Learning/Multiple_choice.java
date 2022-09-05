package Learning;

import java.util.Scanner;

public class Multiple_choice {

	public static void main(String[] args) {
	String question = "what is national fruit in india? ";
	String ans1= "jamun";
	String ans2= "mango";
	String ans3= "cucumber";
	String ans4= "tomato";
	
	String correctAns= ans2;
	
	
	//write print statement for asking questions 
	System.out.println(question);
	// write ans choice
	System.out.println("Choose one of the answer :"+ans1+","+ans2+","+ans3+","+ans4+"");
	
	//Have user input an answer
	Scanner scanner= new Scanner(System.in);
	//Retrieve the user's input	
	String input=scanner.next();
		
	//If the user's input matched with correct answer
		//then the user is correct and we want to print out a congrats massage to user	
	if (correctAns.equals(input.toLowerCase())){
		
		System.out.println("congrats!! thats correct");
		
	}	
	else {
		System.out.println("Ans is not correct . answer will be: "+ans2);
	}
	
	
	
	//If the user  input dose not match with the correct answer
	//then print correct answer 
	}

}
