import java.util.Scanner;

public class SumOfOddIntegers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Input integer N:");
		int n = scan.nextInt();

		int sum = 0;
		for (int i = 1; i < n; i = i + 2){
			sum = sum + i;
		}

		int nSquared = n * n;

		System.out.println("Sum of all odd integers 1 to N: " + sum);
		System.out.println("N^2: " + nSquared);
	}
}