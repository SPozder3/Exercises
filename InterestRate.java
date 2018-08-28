import java.util.Scanner;
import java.text.*;

public class InterestRate{
	public static void main(String[] args){
		DecimalFormat round = new DecimalFormat("0.00");

		int initialDeposit;
		double interestRate;
		int numberOfTimes;
		int numberOfYears;
		Scanner scan = new Scanner(System.in);

		System.out.println("Initial deposit" + "\t:");
		initialDeposit = scan.nextInt();
		System.out.println("Interest rate" + "\t:");
		interestRate = scan.nextDouble();
		System.out.println("Times per year" + "\t:");
		numberOfTimes = scan.nextInt();
		System.out.println("Number of years" + "\t:");
		numberOfYears = scan.nextInt();

		double value = initialDeposit*Math.pow(1 + (interestRate/numberOfTimes), numberOfTimes*numberOfYears);
		System.out.println("Value: $" + round.format(value));
	}
}