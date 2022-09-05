
public class constructoroverloding {
	
	constructoroverloding(int a,int b)//1
	{
		System.out.println(a+b);
	}
	constructoroverloding(int a,int b,double c)//2
	{
		System.out.println(a+b+c);
	}
	constructoroverloding(int a,double b, int c)//3
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		
		constructoroverloding co = new constructoroverloding(15,15);//1
		constructoroverloding c1 = new constructoroverloding(15,18,19.5);//2
		constructoroverloding c2 = new constructoroverloding(15,18.5,19);//3
	}

}
