import java.io.* ;

class ClosestToZero{
  public static void main ( String[] args ){
    int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
    int closestToZero = data[1];
    
    for (int i = 0; i < data.length; i++){
      if (Math.abs(data[i]) <= closestToZero){
        closestToZero = data[i];
      }
    }
      
    System.out.println("The number in data that is closes to zero is " + closestToZero);
  }
}