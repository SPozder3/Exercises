import java.util.Scanner;

public class TownDump{
	public static void main(String[] args){
		int pounds;
		Scanner scan = new Scanner(System.in);

		int charge = 0;
		int extra;
		if (pounds > 200){
			charge = charge + 20;
			pounds = pounds - 200;
		}
		if (pounds > 100){
			extra = pounds % 100;
			charge = charge + (extra * 8);
		}

		System.out.println(charge);
	}
}