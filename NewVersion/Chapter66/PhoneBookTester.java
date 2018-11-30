import java.util.Scanner;

class PhoneEntry
{
  private String firstName;    // first name of a person
  private String lastName;  // last name of a person
  private String phone;   // their phone number

  public PhoneEntry( String fn, String ln, String p )
  {
    firstName = fn; lastName = ln; phone = p;
  }
  
  public String getFirstName()  {return firstName;}
  public String getLastName()  {return lastName;}
  public String getPhone() {return phone;}
}

class PhoneBook
{ 
  private PhoneEntry[] phoneBook; 

  public PhoneBook()
  {
    phoneBook = new PhoneEntry[ 6 ] ;

    phoneBook[0] = new PhoneEntry( "James",  "Barclay", "(418) 665-1223" );
    phoneBook[1] = new PhoneEntry( "Grace",  "Dunbar", "(860) 399-3044" );
    phoneBook[2] = new PhoneEntry( "Paul" , "Kratides", "(815) 439-9271" );
    phoneBook[3] = new PhoneEntry( "Violet",  "Smith", "(312) 223-1937" );
    phoneBook[4] = new PhoneEntry( "John",  "Smith", "(913) 883-2874" );
    phoneBook[5] = new PhoneEntry( "Willoughby",  "Smith", "(312) 992-8761" );

  }

  public PhoneEntry search(String targetName)  
  {
    for ( int j=0; j < phoneBook.length; j++ )
    {
      if ( phoneBook[j] != null && phoneBook[j].getName().equals(targetName) )
        return phoneBook[ j ];
    }

    return null;
  }
}

public class PhoneBookTester
{
  public static void main ( String[] args )
  {
    PhoneBook pb = new PhoneBook();  
    Scanner scan = new Scanner(System.in);

    boolean askForName = true;
    while (askForName){
      System.out.println("Name?");
      String name = scan.nextLine();

      if (name.equals("quit")){
        System.out.println("good-by");
        askForName = false;
        System.exit(0);
      }

      PhoneEntry entry = pb.search(name); 

      if ( entry != null ){
       System.out.println(entry.getName() + ": " + entry.getPhone());
      }else{
       System.out.println("Name not found" );
      }
    }
  }
}