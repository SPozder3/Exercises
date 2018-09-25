import java.util.Scanner;

public class PowerOfANumber{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter X:");
		double x = scan.nextDouble();
		System.out.println("Enter N:");
		int n = scan.nextInt();

		int a = 0;
		double product = 1;
		while (a < n){
			product = product * x;
			a = a + 1;
		}

		if (n < 0){
			System.out.println("N must be a positive integer.");
		}
		else{
			System.out.println(x + " raised to the power of " + n + " is: " + product);
		}
	}
}