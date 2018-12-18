import java.util.Arrays;
class ArraySameElements{
  public static boolean sameElts( int[] a, int[] b ){
    boolean sameElements = true;
    if (a.length != b.length){
      sameElements = false;
    }
    Arrays.sort(a);
    Arrays.sort(b);
    if (!Arrays.equals(a,b)){
      sameElements = false;
    }
    return sameElements;
  }
  
  public static void main ( String[] args ){
    int[] arrayA = { 1, 2, 3, 4, 2 };
    int[] arrayB = { 4, 2, 3, 2, 1 };

    if ( sameElts(arrayA,arrayB) ){
      System.out.println( "Same Elements" );
    }else{
      System.out.println( "DIFFERENT elements" );      
    }
 
  }
}