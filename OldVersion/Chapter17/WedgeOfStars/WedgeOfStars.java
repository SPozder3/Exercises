import java.util.Scanner;

public class WedgeOfStars{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Initial number of stars:");
		int stars = scan.nextInt();

		String numberOfStars = "";
		while (stars > 0){
			int x = 0;
			while (x != stars){
				numberOfStars = numberOfStars + "*";
				x = x + 1;
			}
			System.out.println(numberOfStars);
			stars = stars - 1;
			numberOfStars = "";
		}
	}
}