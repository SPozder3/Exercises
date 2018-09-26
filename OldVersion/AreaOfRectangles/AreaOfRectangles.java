import java.util.Scanner;

public class AreaOfRectangles{
	public static void main(String[] args){
		System.out.println("Computer Aided Design Program");

		Scanner scan = new Scanner(System.in);

		boolean error = False;
		while (error == False){
			System.out.println("First corner X coordinate:");
			int firstX = scan.nextInt();
			System.out.println("First corner Y coordinate:");
			int firstY = scan.nextInt();
			System.out.println("Second corner X coordinate:");
			int secondX = scan.nextInt();
			System.out.println("Second corner Y coordinate:");
			int secondY = scan.nextInt();
			
			int width = secondX - firstX;
			int height = secondY - firstY;
			int area = width * height;
			if (height == 0 || width == 0){
				System.out.println("Width: " + width);
				System.out.println("Height: " + height);
				System.out.println("Area: " + area);
				System.out.println("Finished");
				error = True;
			}
			else{
				System.out.println("Width: " + width);
				System.out.println("Height: " + height);
				System.out.println("Area: " + area);
			}
		}
	}
}