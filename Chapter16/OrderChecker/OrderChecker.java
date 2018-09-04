import java.util.Scanner;

public class OrderChecker{
	public static void main(String[] args){
		int bolts;
		int nuts;
		int washers;
		Scanner scan = new Scanner(System.in);

		System.out.println("Number of bolts: ");
		bolts = scan.nextInt();
		System.out.println("Number of nuts: ");
		nuts = scan.nextInt();
		System.out.println("Number of washers: ");
		washers = scan.nextInt();

		if (nuts < bolts){
			System.out.println("Check the Order: too few nuts");
		} 
		if (bolts*2 > washers) {
			System.out.println("Check the Order: too few washers");
		} 
		else {
			System.out.println("Order is OK.");
		}

		int boltPrice = 5;
		int nutPrice = 3;
		int washerPrice = 1;

		int cost = bolts*boltPrice + nuts*nutPrice + washers*washerPrice;
		System.out.println("Total cost: " + cost + " cents");
	}
}