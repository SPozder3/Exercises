import java.util.Scanner;

public class FurtherSubstringFun{
	public static void main(String[] args){
		String statement;
		int beginIndex;
		int endIndex;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a string:");
		statement = scan.nextLine();
		System.out.println("Enter beginning index:");
		beginIndex = scan.nextInt();
		System.out.println("Enter ending index:");
		endIndex = scan.nextInt();
		String substring = statement.substring(beginIndex,endIndex);

		System.out.println("Original string:");
		System.out.println(statement);
		System.out.println("Substring:");
		System.out.println(substring);

	}
}