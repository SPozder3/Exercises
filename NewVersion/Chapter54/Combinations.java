import java.util.Scanner;

public class Combinations{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter N:");
		int n = scan.nextInt();
		System.out.println("Enter R:");
		int r = scan.nextInt();

		int x = n - r;

		for (i = 1; i <= n; i++){
			int factN = factN * i;
		}
		for (j = 1; j <= r; j++){
			int factR = factR * i;
		}
		for (k = 1; k <= xl k++){
			int factX = factX * i;
		}

		int combination = factN / (factR * factX);
		System.out.println("The combination is: " + combination);
	}
}