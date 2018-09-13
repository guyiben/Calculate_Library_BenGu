//calculate methods in the calculate library
//Client code for calculate method
//Ben Gu
//9/6/2018
//Version 0
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-3));
		System.out.println(Calculate.cube(-3));
		System.out.println(Calculate.average(4.5,5.5));
		System.out.println(Calculate.average(4.5,5.5,6.5));
		System.out.println(Calculate.toDegrees(3.14));
		System.out.println(Calculate.toRadians(90));
	}
}
