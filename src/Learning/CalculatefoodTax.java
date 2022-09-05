package Learning;

public class CalculatefoodTax {
 public static double foodTaxAndTips(double listedmealPrice,double taxrate, double tiprate ) {
	 
	 double tax= taxrate * listedmealPrice;
	 double tip= tiprate * listedmealPrice;
	 double result = listedmealPrice + tax+ tip;
	return result;
 }
	public static void main(String[] args) {
		double grouptotalmeal=foodTaxAndTips(100,.09,.10);
		System.out.println(grouptotalmeal);
		
		double induvisualmealPrice= grouptotalmeal/5;
		
		System.out.println(induvisualmealPrice);
		
	}

}
