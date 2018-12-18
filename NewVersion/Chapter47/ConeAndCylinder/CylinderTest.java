public class CylinderTest{
	public static void main(String[] args){
		Cylinder rod = new Cylinder(3.0,4.0);

		System.out.println("Radius: " + rod.getRadius());
		System.out.println("Height: " + rod.getHeight());

		System.out.println("Surface Area: " + rod.surfaceArea());
		System.out.println("Volume: " + rod.volume());
	}
}