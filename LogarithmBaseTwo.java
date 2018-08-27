import java.util.Scanner;

public class LogarithmBaseTwo{
	public static void main(String[] args){
		double x;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a double:");
		x = scan.nextDouble();

		double answer = Math.log(x)/Math.log(2);
		System.out.println("Base 2 log of " + x + " is " + answer);
	}
}