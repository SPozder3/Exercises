import java.util.Arrays;

public class ArrayEquality{
  public static boolean myEquals( int[] a, int[] b ){
  	boolean equal = true;
  	if (a == null || b == null){
  		equal = false;
  	}
    for (int i = 0; i < a.length; i++){
    	if (a[i] != b[i]){
    		equal = false;
    	}
    }
    for (int i = 0; i < b.length; i++){
    	if (a[i] != b[i]){
    		equal = false;
    	}
    }
    return equal;
  }
  
  public static void main ( String[] args ){
    int[] arrayA = { 5, 6, 8, 7 };
    int[] arrayB = { 5, 6, 8, 7 };

    System.out.print("Arrays says: ")    ;
    if (Arrays.equals(arrayA,arrayB)){
      System.out.println("Equal");
    }else{
      System.out.println("NOT Equal");      
    }

    System.out.print("myEquals says: ");
    if (myEquals(arrayA,arrayB)){
      System.out.println("Equal");
    }else{
      System.out.println("NOT Equal");      
    }
  }
}