import java.util.Scanner;

public class OneOverNSum{
	public static void main(String[] args){
		int n;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter N:");
		n = scan.nextInt();

		double sum = 0.0;
		while (n != 0){
			double sumFormula = 1.0/n;
			sum = sum + sumFormula;
			n = n - 1;
		}

		System.out.println("Sum is: " + sum);
	}
}