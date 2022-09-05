package java_basic_0;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayL {

	public static void main(String[] args) {
		// create arraylist
		ArrayList<Integer> Al= new ArrayList<Integer>();
		 ArrayList<String> cars = new ArrayList<String>();
		 //add elements/ number inside arraylist
		 Al.add(1);
		 Al.add(3);
		 Al.add(4);
		 Al.add(6);
		 // add elements/name inside arraylist
		 cars.add("volvo");
		 cars.add("Maruti");
		 cars.add("Tesla");
		
		 System.out.println(Al);
		 System.out.println(cars);
		 
		 //get method 
	       Al.get(0);
		   Al.get(1);
		   Al.get(2);
	       Al.get(3);
		
		 
		 
		 System.out.println(Al.get(3)); 
		 
		// add elements in between two numbres
		 
		 Al.add(1,2);
		 Al.add(4,5);
		 
		 System.out.println("add elements in between:  "+Al); 
		 
		 //set elements
		 Al.set(0,0);
		 System.out.println("set elements:  "+Al);
		 
		 //delete elements
		 
		 Al.remove(3);
		 System.out.println("delete elements: "+Al);
		 
		 //size
		int size= Al.size();
		 System.out.println("size of array list: "+size); 
		 
		 //Sorting
		 Collections.sort(Al);
		 System.out.println("size of sorting list: "+Al); 
		 //Loops
		 
		 for (int i=0;i<Al.size();i++)
		 {
			 System.out.println(Al.get(i));
			 
		 }
		 
		
		 
		 
	}

}
