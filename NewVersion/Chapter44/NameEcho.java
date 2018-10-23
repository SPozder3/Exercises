import java.util.Scanner;

public class NameEcho{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your name: ");
		String name = scan.nextLine();

		name = name.trim();

		int space = name.indexOf(" ");

		String firstName = name.substring(0,space);
		String lastName = name.substring(space,name.length());

		String upperCaseLastName = lastName.toUpperCase();

		String newName = firstName.concat(upperCaseLastName);

		System.out.println(newName);
	}
}