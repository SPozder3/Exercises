public class ReverseOrder{
	public static void main(String[] args){
		int[] val = {0, 1, 2, 3}; 
    	int[] temp = {0,0,0,0};
 
   	 	System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
 
 		for(int i = 0; i < val.length; i++){
 			temp[i] = val[val.length - 1 - i];
 		}
    
 
    	System.out.println( "Reversed Array: " + temp[0] + " " + temp[1] + " " + temp[2] + " " + temp[3]);
    }
}