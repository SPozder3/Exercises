public class AverageRainFall{
	public static void main(String[] args){
		int rain_apr = 12;
		int rain_may = 14;
		int rain_jun = 8;
		System.out.println("Rainfall for April: \t" + rain_apr);
		System.out.println("Rainfall for May: \t" + rain_may);
		System.out.println("Rainfall for June: \t" + rain_jun);
		double average = (rain_apr + rain_may + rain_jun)/3.0;
		System.out.println("Average rainfall: \t" + average);
	}
}