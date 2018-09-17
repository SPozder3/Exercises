import java.util.Scanner;

public class HarmonicMean{
	public static void main(String[] args){
		double x;
		double y;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter X:");
		x = scan.nextDouble();
		System.out.println("Enter Y:");
		y = scan.nextDouble();

		double harmonicmean = 2.0/(1.0/x + 1.0/y);
		double mean = (x + y)/2;
		System.out.println("Arithmetic mean: " + mean);
		System.out.println("Harmonic mean: " + harmonicmean);
	}
}