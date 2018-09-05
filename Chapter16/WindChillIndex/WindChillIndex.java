import java.util.Scanner;
import java.lang.Math;

public class WindChillIndex{
	public static void main(String[] args){
		int temperature;
		int windSpeed;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Wind Speed:");
		windSpeed = scan.nextInt();
		System.out.println("Enter Temperature:");
		temperature = scan.nextInt();

		double windChill;
		if (windSpeed < 3){
			windChill = temperature;
		}
		else if (temperature > 50){
			windChill = temperature;
		}
		else {
			windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
		}
		System.out.println("Wind Chill: " + windChill);
	}
}