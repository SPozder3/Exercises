import java.util.Scanner;

public class DistanceABrickTravels{
	public static void main(String[] args){
		double seconds;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of seconds:");
		seconds = scan.nextDouble();

		double distance = (32.174*(seconds*seconds))/2.0;
		System.out.println("Distance:" + distance);
	}
}