public class DegreesToRadians{
	public static void main(String[] args){
		double rad = 30 * Math.PI/180;
		double sinx = Math.sin(rad);
		double cosx = Math.cos(rad);
		double sum = sinx * sinx + cosx * cosx;
		System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum );
	}
}