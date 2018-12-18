import java.util.Scanner;

public class Combinations{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter N:");
		int n = scan.nextInt();
		System.out.println("Enter R:");
		int r = scan.nextInt();

		int x = n - r;

		int factN = 1;
		int factR = 1;
		int factX = 1;
		for (int i = 1; i <= n; i++){
			factN = factN * i;
		}
		for (int j = 1; j <= r; j++){
			factR = factR * j;
		}
		for (int k = 1; k <= x; k++){
			factX = factX * k;
		}

		int combination = factN / (factR * factX);
		System.out.println("The combination is: " + combination);
	}
}