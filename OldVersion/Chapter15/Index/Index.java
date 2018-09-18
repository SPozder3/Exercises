import java.util.Scanner;

public class Index{
	public static void main(String[] args){
		String firstInput;
		String secondInput;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first word:");
		firstInput = scan.nextLine();
		System.out.println("Enter the second word:");
		secondInput = scan.nextLine();

		int x = 0;
		String period = ".";
		while (x < 30){
			period = period + ".";
			x = x + 1;
		}

		System.out.println(firstInput + period + secondInput);
	}
}