package java_basic_0;

public class Addition_test {
	

		  public static void main(String[] args) {
		    
		   // System.out.println("Enter two numbers");
		    int first = 10;
		    int second = 20;
		    int third = 5;
		    
		    System.out.println(first + " " + second+ " " + third);

		    // add two numbers
		    int sum = first + second + third;
		    System.out.println("The sum is: " + sum);
		    System.out.println("result is :" +(first==second));
		    System.out.println("result is :" +(first<second));
		    System.out.println("result is :" +(first>second));
		    System.out.println("result is :" +(first<=second));
		    System.out.println("result is :" +(first!=second));
		    
		    int a = 74;
		    int b = 36;
		    
		    System.out.println("sum is :" + (a+b));
		    
		    int x = 100, y = 200;
		    
	        System.out.println("Before Swap");
	        System.out.println("x = " + x);
	        System.out.println("y = " + y);
	 
	        int c = x;
	        x = y;
	        y = c;
	 
	        System.out.println("--------After swap-------");
	        System.out.println("x = " + x);
	        System.out.println("y = " + y);
	        
	        
	        //if & else
	        
	        int age = 20;
	         if (age>=18)
	         
	         { 
	        	 System.out.println(" eligible for vote");
	         }
	         else
	         { 
	        	 System.out.println("not eligible for vote");
	        	 
	        	 
	         }
	         
	        // switch 
	          int day = 2;
	          switch (day) 
	          {
	          case 1 : System.out.println("sun");break;
	          case 2 : System.out.println("Mon");break;
	          case 3 : System.out.println("tus");break;
	          case 4 : System.out.println("wed");break;
	          case 5 : System.out.println("thus");break;
	          case 6 : System.out.println("fry");break;
	          case 7 : System.out.println("sat");break;
	          default : System.out.println("invalid");
	          
	          }
	          //while loops
	           int l = 10;
	           //l=2;
	           System.out.println("*********************************");
	           while (l>0) 
	           {
	        	   System.out.println(l);
	        	  // l++; //one pluse
	        	  // l+=2;//even number
	        	   l--;
	        	   
	           }
	           System.out.println("*********************************");
	          
	           for (int k=10; k>0;k--)
	           { 
	        	   System.out.println(k);
	           }
	        
	        
		  }
		}


