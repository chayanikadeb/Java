package practice_java;

public class Reversestring {

	public static void main(String[] args) {
		
		//one way
		
		String str ="ABCD";//original value
		String rev ="";//difine Reverse value
		
		int ln = str.length();//get length
	
		System.out.println(ln);
		
		
		for(int i=ln-1;i>=0;i--) {
			
			rev=rev+str.charAt(i);
			
		}
		
		System.out.println(rev);
		
		String st ="EFIH";
		//String rev ="";
		
		StringBuffer sb= new StringBuffer(st);
		sb.reverse();
		 System.out.println("String buffer after reversing = " + sb);
		
	}


	
	
	
	
	

}
