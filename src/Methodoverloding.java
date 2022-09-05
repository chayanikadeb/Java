
public class Methodoverloding {

	void add (int a,int b) //1
	{
		System.out.println(a+b);
	}
	void add (double a,int b) //2
	{
		System.out.println(a+b);
	}
	
	void add (double a,double b) //3
	{
		System.out.println(a+b);
	}
	void add (double a,double b,int c) //4
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
	
		
		Methodoverloding mo = new Methodoverloding();
		mo.add(15.6, 18.9);//3
		mo.add(6, 7);//1
		mo.add(56.2, 10.6, 35);//4
		

	}

}
