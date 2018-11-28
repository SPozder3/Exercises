import java.io.* ;

public class SumOfElements{

  public static void main ( String[] args ) {
    int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
    int sum = 0;
    int sumEven = 0;
    int sumOdd = 0;
    
    for (int i = 0; i < data.length; i++){
    	sum = sum + data[i];
    	if (data[i] % 2 == 0){
    		sumEven = sumEven + data[i];
    	}else{
    		sumOdd = sumOdd + data[i];
    	}
    }
      
    System.out.println("The sum of the numbers in data: " + sum);
    System.out.println("The sum of the even numbers in data: " + sumEven);
    System.out.println("The sum of the odd numbers in data: " + sumOdd);
  }
}      