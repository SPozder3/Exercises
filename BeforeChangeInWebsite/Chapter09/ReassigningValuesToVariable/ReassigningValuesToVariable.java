public class ReassigningValuesToVariable
{  
  public static void main ( String[] args )  
  {
    double a = 0.0;
    System.out.println("At X = " + a + " the value is " + (3 * a * a - 8 * a + 4));
    double b = 2.0;
    System.out.println("At X = " + b + " the value is " + (3 * b * b - 8 * b + 4));
    System.out.println("At X = " + b * 2 + " the value is " + (3 * b * 2 * b * 2 - 8 * b * 2 + 4));
  }
}