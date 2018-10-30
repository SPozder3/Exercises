import java.util.Scanner;

public class PasswordChecker{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);


		String digits = "0123456789";
		boolean allowedPassword = false;
		boolean digitInPassword = false;
		boolean upperAndLowerCase = false;
		while (! allowedPassword){
			System.out.println("Enter your password:");
			String password = scan.nextLine();
			int passwordLength = password.length();
			if (passwordLength >= 7){
				for (int i = 0; i < password.length(); i++){
					for (int j = 0; j < digits.length(); j++){
						if (password.charAt(i) == digits.charAt(j)){
							digitInPassword = true;
						}
						else{
							digitInPassword = false;
						}
					}
				}
				String allUpper = password.toUpperCase();
				String allLower = password.toLowerCase();
				if (!allUpper.equals(password) && !allLower.equals(password)){
					upperAndLowerCase = true;
				}
				else{
					upperAndLowerCase = false;
				}
				if (upperAndLowerCase && digitInPassword){
					System.out.println("That password is acceptable.");
					allowedPassword = true;
				}
				else{
					System.out.println("That password is not acceptable.");
					System.out.println(" ");
				}
			}
			else{
				System.out.println("That password is not acceptable.");
				System.out.println(" ");
			}
		}
	}
}