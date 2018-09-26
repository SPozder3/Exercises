import java.util.Scanner;

public class InRangeAdder{
	public static void main(String[] args){
		System.out.println("In-range Adder");

		Scanner scan = new Scanner(System.in);
		System.out.println("Low end of range:");
		int low = scan.nextInt();
		System.out.println("High end of range:");
		int high = scan.nextInt();

		int sumInRange = 0;
		int sumOutRange = 0;
		int data = 1;
		while (data != 0){
			System.out.println("Enter data:");
			data = scan.nextInt();
			if (data > low && data < high){
				sumInRange = sumInRange + data;
			}
			else{
				sumOutRange = sumOutRange + data;
			}
		}
		System.out.println("Sum of in range values: " + sumInRange);
		System.out.println("Sum of out of range values: " + sumOutRange);
	}
}