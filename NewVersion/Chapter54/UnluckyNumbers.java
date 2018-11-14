import java.util.Scanner;

public class UnluckyNumbers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a number:");
		int number = scan.nextInt();

		if (number == 13){
			System.out.println("That number is unlucky.");
			System.exit(0);
		}

		boolean notAUnluckyNumber = true;
		while (notAUnluckyNumber){
			if (number % 100 == 13){
				System.out.println("That number is unlucky.");
				notAUnluckyNumber = false;
			}
			number = number/10;
			if (number == 13){
				System.out.println("That number is unlucky.");
				notAUnluckyNumber = false;
			}
			if (number == 0){
				System.out.println("That number is safe.");
				notAUnluckyNumber = false;
			}
		}
	}
}