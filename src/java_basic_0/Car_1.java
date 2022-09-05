package java_basic_0;
//create myCar object; call height, width, maxspeed.
public class Car_1 {
//height
public void height (int carheight) 
{
	System.out.println("car height is:  " +carheight);
}	
	
	//width
public void width(int carwidth)	
{
	System.out.println("car width is:  " +carwidth);
}
	// maxspeed

public void maxspeed (int carmaxspeed)
{
	System.out.println("car max speed is:  " +carmaxspeed);
	
}
	public static void main(String[] args) {
		
		Car_1 myCar=new Car_1();
		myCar.height(4);
		myCar.width(6);
		myCar.maxspeed(100);

	}

}
