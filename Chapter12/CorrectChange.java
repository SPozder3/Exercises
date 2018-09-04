import java.util.Scanner;

public class CorrectChange{
	public static void main(String[] args){
		int cents;
		Scanner scan = new Scanner(System.in);

		System.out.println("Input the change (in cents): ");
		cents = scan.nextInt();

		int dollars = cents/100;
		int remainder = cents % 100;
		int quarters = remainder/25;
		int second_remainder = remainder % 25;
		int dimes = second_remainder/10;
		int third_remainder = second_remainder % 10;
		int nickels = third_remainder/5;
		int fourth_remainder = third_remainder % 5;
		int pennies = fourth_remainder/1;

		System.out.println("Your change is: " + dollars + " dollars, " + quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels and " + pennies + " pennies.");
	}
}