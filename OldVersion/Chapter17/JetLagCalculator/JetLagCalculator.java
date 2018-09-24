import java.util.Scanner;

public class JetLagCalculator{
	public static void main(String[] args){
		int hours;
		int zones;
		int timeDepart;
		int timeArrive;
		Scanner scan = new Scanner(System.in);

		System.out.println("How many hours was your flight?");
		hours = scan.nextInt();
		System.out.println("How many time zones did you cross?");
		zones = scan.nextInt();
		System.out.println("What time did you depart? (24 hour clock)");
		timeDepart = scan.nextInt();
		System.out.println("What time did you arrive? (24 hour clock)");
		timeArrive = scan.nextInt();

		int depart;
		if (timeDepart >= 1 && timeDepart <= 8){
			depart = 5;
		}
		else if (timeDepart <= 12){
			depart = 0;
		}
		else if (timeDepart <= 18){
			depart = 1;
		}
		else if (timeDepart <= 22){
			depart = 3;
		}
		else{
			depart = 4;
		}

		int arrive;
		if (timeArrive >= 1 && timeArrive <= 8){
			arrive = 3;
		}
		else if (timeArrive <= 12){
			arrive = 4;
		}
		else if (timeArrive <= 18){
			arrive = 2;
		}
		else if (timeArrive <= 22){
			arrive = 0;
		}
		else{
			arrive = 1;
		}

		double recovery = ((hours/2.0) + (zones-3) + depart + arrive)/10.0;
		System.out.println("Days of recovery: " + recovery);
	}
}