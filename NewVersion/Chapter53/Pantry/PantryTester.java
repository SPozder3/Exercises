import java.util.Scanner;
public class PantryTester{
  public static void main ( String[] args ){
  	Scanner scan = new Scanner(System.in);

    Jam goose = new Jam("Gooseberry","7/4/86",12);
    Jam apple = new Jam("Crab Apple","9/30/99",8);
    Jam rhub  = new Jam("Rhubarb","10/31/99",3);

    System.out.println("Welcome to Mother Hubbard's Pantry!");
    System.out.println("");

    Pantry hubbard = new Pantry(goose,apple,rhub);
    System.out.println(hubbard);

    int spreadingjams = 1;
    while (spreadingjams = 1){
    	System.out.println("Enter your selection (1, 2, or 3):");
    	int selection = scan.nextInt();
   		System.out.println("Enter amount to spread:");
    	int spread = scan.nextInt();

    	hubbard.select(selection);
    	hubbard.spread(spread);
    	System.out.println(hubbard);

    	System.out.println("Would you like to spread another jam?");
    	String spreadOrNot = scan.nextLine();

    	if (spreadOrNot.equals("no")){
    		spreadingjams = false;
    	}
    }
  }
}