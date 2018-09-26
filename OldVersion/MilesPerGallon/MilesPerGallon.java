import java.util.Scanner;

public class MilesPerGallon{
	public static void main(String[] args){
		System.out.println("Miles Per Gallon Program");

		Scanner scan = new Scanner(System.in);
		
		int initialMiles = 0;
		while (initialMiles >= 0){
			System.out.println("Initial miles:");
			initialMiles = scan.nextInt();
			System.out.println("Final miles:");
			int finalMiles = scan.nextInt();
			System.out.println("Gallons:");
			int gallons = scan.nextInt();

			int miles = finalMiles - initialMiles;
			double milesPerGallon = miles/gallons;
		}
		System.out.println("bye");


	}
}