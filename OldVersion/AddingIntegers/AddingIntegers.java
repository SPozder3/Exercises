import java.util.Scanner;

public class AddingIntegers{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first integer (enter 0 to quit):");
		int integer = scan.nextInt();

		int sum = 0;
		if (integer == 0){
			System.out.println("No integers were entered.");
		}
		else {
			while (integer != 0){
				sum = sum + integer;
				System.out.println("Enter an integer (or 0 to quit):");
				integer = scan.nextInt();
			}
			System.out.println("Sum of the integers: " + sum);
		}
		System.out.println("bye");
	}
}