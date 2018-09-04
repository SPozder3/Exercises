import java.util.Scanner;

public class OhmsLaw{
	public static void main(String[] args){
		int voltage;
		int resistance;
		Scanner scan = new Scanner(System.in);

		System.out.println("What is the voltage?");
		voltage = scan.nextInt();

		System.out.println("What is the resistance?");
		resistance = scan.nextInt();

		double current = (voltage + 0.0)/resistance;
		System.out.println("The current is: " + current);
	}
}