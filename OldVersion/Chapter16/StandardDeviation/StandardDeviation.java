import java.util.Scanner;

public class StandardDeviation{
	public static void main(String[] args){
		int n;
		Scanner scan = new Scanner(System.in);

		System.out.println("How many numbers?");
		n = scan.nextInt();

		int x = 0;
		double sum = 0.0;
		double sumSquare = 0.0;
		while (x < n){
			double number;
			System.out.println("Enter floating point number:");
			number = scan.nextDouble();

			sum = sum + number;
			sumSquare = sumSquare + (number*number);

			x = x + 1;
		}
		double avg = (sum/n)*(sum/n);
		double avgSquare = sumSquare/n;
		double standardDeviation = Math.sqrt(avgSquare - avg);
		System.out.println("Standard deviation: " + standardDeviation);
	}
}