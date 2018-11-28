import java.io.* ;

class ReversalOfElements{
  public static void main ( String[] args ) {
    int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int[] result = {0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    for ( int j=0; j < data.length; j++){
      result[j] = data.length - j;
    }
      
    for ( int j=0; j < result.length; j++){
      System.out.println(result[j]);
    }
  }
}