import java.util.Scanner;

public class Permutations{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter N:");
		int n = nextInt();
		System.out.println("Enter R:");
		int r = nextInt();

		if (n < 0 || r < 0 || r > n){
			System.out.println("Both must be 0 or postitive and R must be less than or equal to N");
		}
		else {
			long nFactorial;
			long denominatorFactorial;
			while (n > 0){
				nFactorial = nFactorial * n;
				n = n - 1;
			}
			int denominator = n - r;
			while (denominator > 0){
				denominatorFactorial = denominatorFactorial * denominator;
				denominator = denominator - 1;
			}
			long permutation = nFactorial/denominatorFactorial;
		}
	}
}