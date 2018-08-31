import java.util.Scanner;
import java.text.*;

public class DoubleInterestRate{
	public static void main(String[] args){
		DecimalFormat round = new DecimalFormat("0.0");

		double interestRate;
		Scanner scan = new Scanner(System.in);

		System.out.println("Percentage of interest rate:");
		interestRate = scan.nextDouble();

		double years = 72.0/interestRate;
		System.out.println("Number of years: " + round.format(years));
	}
}