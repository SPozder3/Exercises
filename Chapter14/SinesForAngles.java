import java.text.*;

public class SinesForAngles{
	public static void main(String[] args){
		DecimalFormat form = new DecimalFormat("0.000000");
		DecimalFormat zero = new DecimalFormat("0.0");
		double angle = 105.0;
		
		while (angle >= -75.0){
			angle = angle - 15;
			double radians = angle * Math.PI/180;
			double sinx = Math.sin(radians);

			if (angle <= -15.0 && angle >= -90.0){
				System.out.println(angle + "\t" + form.format(sinx));
			}
			else if (angle != 0.0){
				System.out.println(" " + angle + "\t" + " " + form.format(sinx));
			}
			else{
				System.out.println("  " + angle + "\t" + " " + zero.format(sinx));
			}

		}
	}
}