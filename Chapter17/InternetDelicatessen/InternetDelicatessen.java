import java.util.Scanner;

public class InternetDelicatessen{
	public static void main(String[] args){
		String item;
		Double price;
		int express;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the item:");
		item = scan.nextLine();
		System.out.println("Enter the price:");
		price = scan.nextDouble();
		System.out.println("Overnight delivery (0==no, 1==yes):");
		express = scan.nextInt();

		double delivery = 0;
		if (price < 10){
			delivery = delivery + 2;
		}
		if (express == 1){
			delivery = delivery + 3;
		}

		double total = delivery + price;

		System.out.println("Invoice:");
		System.out.println(item + " " + price);
		System.out.println("delivery" + " " + delivery);
		System.out.println("total" + " " + total);
	}
}