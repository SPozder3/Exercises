import java.util.Scanner;

public class AddingUpIntegers{
	public static void main(String[] args){
		int numberOfInt;
		int value;
		Scanner scan = new Scanner(System.in);

		System.out.println("How many integers will be added:");
		numberOfInt = scan.nextInt();

		int x = 0;
		int sum = 0;
		while (x < numberOfInt){
			System.out.println("Enter an Integer:");
			value = scan.nextInt();

			sum = sum + value;
			x = x + 1;
		}

		System.out.println("The sum is " + sum);
	}
}