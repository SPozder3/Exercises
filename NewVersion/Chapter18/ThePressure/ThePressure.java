import java.util.Scanner;

public class ThePressure{
	public static void main(String[] args){
		int rightFront;
		int leftFront;
		int rightRear;
		int leftRear;
		Scanner scan = new Scanner(System.in);

		System.out.println("Input right front pressure:");
		rightFront = nextInt();
		System.out.println("Input left front pressure:");
		leftFront = nextInt();
		System.out.println("Input right rear pressure:");
		rightRear = nextInt();
		System.out.println("Input left rear pressure:");
		leftRear = nextInt();

		String inflation;
		if (rightFront = leftFront && rightRear = leftRear){
			inflation = "OK";
		}
		else {
			inflation = "Not OK";
		}

		System.out.println("Inflation is " + inflation);
	}
}