import util.java.Scanner;

public class DiscountPrices{
	public static void main(String[] args){
		int cost;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter amount of purchases:");
		cost = scan.nextInt;

		if (cost > 10){
			int discount = cost - (cost * 0.1);
			System.out.println("Discounted price:" + discount);
		} else {
			System.out.println("Discount not avaliable");
		}
	}
}