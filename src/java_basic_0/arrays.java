package java_basic_0;

public class arrays {

	public static void main(String[] args) {
		
		int a[][]=new int [3][2]; //one methord
		
		a [0][0]=100;
		a [0][1]=200;
		
		a [1][0]=300;
		a [1][1]=400;
		
		a [2][0]=100;
		a [2][1]=500; 
		
		
		//int a [][]= {{100,200},{300,400},{500,600}};
		
		
		System.out.println("number of rows :" + a.length);
		System.out.println("number of coloums :" + a[0].length);
		
		for (int i=0;i<a.length;i++);
		{
			for (int j=0; j<a[0].length;j++);
			
			{
		
		//System.out.println(a[i][j]);
				System.out.println(a[i][j]);

			}
		}


	}
}
