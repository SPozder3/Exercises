import java.io.* ;

public class TwoLargestElements {

  public static void main ( String[] args )  {
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    int largest = 0;
    int secondLargest = 0;

    for (int i = 0;i < data.length;i++){
      if(data[i] > largest){
        secondLargest = largest;
        largest = data[i];
      }
      if(data[i] > secondLargest && data[i] < largest){
        secondLargest = data[i];
      }
    }
      
    System.out.println("The largest number in data is " + largest);
    System.out.println("The second largest number in data is " + secondLargest);
  }
}