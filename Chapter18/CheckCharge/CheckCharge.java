public class CheckCharge{
	public static void main(String[] args){
		int checking;
		int saving;
		Scanner scan = new Scanner(System.in);

		System.out.println("What is in your checkings?");
		checking = nextInt();
		System.out.println("What is in your savings?");
		saving = nextInt();

		double charge;
		if (checking > 1000 || savings > 1500){
			charge = 0.15;
		}
		else{
			charge = 0.0;
		}

		System.out.println(charge);
	}
}