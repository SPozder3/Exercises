import java.util.Scanner;

public class AnnualApplianceCost{
	public static void main(String[] args){
		double cents;
		double perYear;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter cost per Kilowatt-hour in cents:");
		cents = scan.nextDouble();
		System.out.println("Enter kilowatt-hours used per year:");
		perYear = scan.nextDouble();

		double annualcost = (cents*perYear)/100.0;
		System.out.println("Annual cost: " + annualcost);
	}
}