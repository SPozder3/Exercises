public class TriangleAndSquareNumbers{
	public static void main(String[] args){
		for (int x = 0; x <= 100; x++){
			boolean sqrNum = false;
			boolean triangleNum = false; 
			for (int sqr = 0; sqr * sqr <= 100; sqr++){
				if (sqr * sqr == x){
					sqrNum = true;;
				}
			}
			int sum = 0;
			for (int i = 0; i <= x; i++){
				sum = sum + 1;
				if (sum == x){
					triangleNum = true;
					i = x;
				}
			}
		}
		if ((triangleNum && sqrNum) && (x != 0)){
			System.out.println(x + " is a square and triangle number.");
		}
	}
}