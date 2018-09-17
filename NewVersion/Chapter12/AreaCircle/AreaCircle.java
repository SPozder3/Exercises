import java.util.Scanner;

public class AreaCircle{
	public static void main(String[] args){
		int radius;
		Scanner scan = new Scanner(System.in);

		System.out.println("Input the radius: ");
		radius = scan.nextInt();

		double area = Math.PI * radius * radius;
		System.out.println("The area is: " + area);
	}
}