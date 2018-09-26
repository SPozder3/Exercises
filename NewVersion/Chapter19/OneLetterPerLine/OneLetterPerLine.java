import java.util.Scanner;

public class OneLetterPerLine{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word:");
		String word = scan.nextLine();

		int x = 0;
		while (x < word.length()){
			System.out.println(word.charAt(x));
			x = x + 1;
		}
	}
}