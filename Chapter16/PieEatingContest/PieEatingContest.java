import java.util.Scanner;

public class PieEatingContest{
	public static void main(String[] args){
		int weight;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter weight:");
		weight = scan.nextInt();

		if (weight >= 220 && weight <= 280){
			System.out.println("Allowed");
		} else {
			System.out.println("Denied");
		}
	}
}