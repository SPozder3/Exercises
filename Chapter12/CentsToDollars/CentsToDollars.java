import java.util.Scanner;

public class CentsToDollars{
	public static void main(String[] args){
		int cents;
		Scanner scan = new Scanner(System.in);

		System.out.println("Input the cents: ");
		cents = scan.nextInt();

		int dollars = cents/100;
		int remaining_cents = cents % 100;
		System.out.println("That is " + dollars + " dollars and " + remaining_cents + " cents.");
	}
}