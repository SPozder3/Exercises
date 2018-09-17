import java.util.Scanner;

public class StartAndEnd{
	public static void main(String[] args){
		int start;
		int end;
		Scanner scan = new Scanner(System.in);

		System.out.println("What is the start of the numbers?");
		start = scan.nextInt();
		System.out.println("What is the end of the numbers?");
		end = scan.nextInt();

		while (start <= end){
			System.out.println(start);
			start = start + 1;
		}		
	}
}