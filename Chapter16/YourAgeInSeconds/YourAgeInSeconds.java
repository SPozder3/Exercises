import java.util.Scanner;
import java.lang.Math;

public class YourAgeInSeconds{
	public static void main(String[] args){
		int years;
		int months;
		int days;
		Scanner scan = new Scanner(System.in);

		System.out.println("Years:");
		years = scan.nextInt();
		System.out.println("Months:");
		months = scan.nextInt();
		System.out.println("Days:");
		days = scan.nextInt();

		int totalDaysInYears = years * 365;

		int totalDaysInMonths = 0;
		int[] daysPerMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
		for (int i = 0; i < months; i++) {
			totalDaysInMonths += daysPerMonth[i];
		}

		int totalDays = totalDaysInYears + totalDaysInMonths + days;
		int totalSeconds = totalDays * 86400;
		System.out.println("Total seconds: " + totalSeconds);

		double humanLifespan = 25 * Math.pow(10,8);
		double percentageOfLifespan = (totalSeconds/humanLifespan) * 100;
		System.out.println("Percentage of life: " + percentageOfLifespan + "%");
	}
}