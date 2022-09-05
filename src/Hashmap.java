import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map = new HashMap();
		map.put("1", "Sujoy");
		map.put("2", "Kumar");
		map.put("3","Deb");
		boolean isMap= map.isEmpty();
		// HashMap is empty ??
		if (isMap == false)
		//if(false)
		{
			System.out.println("HashMap is Not Empty"+map.get("2"));
			
		}
		else 
		{
			System.out.println("HashMap is Empty");
		}

	}

}
