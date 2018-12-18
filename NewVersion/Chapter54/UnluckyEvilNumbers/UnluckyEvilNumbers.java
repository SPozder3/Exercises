public class UnluckyEvilNumbers {
	public static void main(String[] args) {
		for (int i = 0; i < 1000; i++) {
			if (checkUnlucky(i)) {	
				if (! checkOdious(i)) {
					System.out.println(i + " is evil and unlucky.");
				}
			}
		}
	}

	public static Boolean checkUnlucky(int number) {
		boolean notAUnluckyNumber = false;
		while (notAUnluckyNumber){
			number = number/10;
			if (number == 13){
				notAUnluckyNumber = true;
			}
			if (number == 0){
				notAUnluckyNumber = true;
			}
		}		

		return isUnlucky;
	}

	public static Boolean checkOdious(int number) {
		int count = 0;
		int x = number;
		
		while (number != 0) {
			if (number % 2 == 1) {
				count++;
			}
			number /= 2;
		}

		if (count % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
}