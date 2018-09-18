import java.util.Scanner;

public class RepeatWord{
	public static void main(String[] args){
		String word;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a word:"); 
		word = scan.nextLine();

		int x = 0;
		while (word.length() > x){
			System.out.println(word);
			x = x + 1;
		}
	}
}