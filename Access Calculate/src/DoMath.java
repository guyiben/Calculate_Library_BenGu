//calculate methods in the calculate library
//Client code for calculate method
//Ben Gu
//9/24/2018
//Version 1
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-3));
		System.out.println(Calculate.cube(-3));
		System.out.println(Calculate.average(4.5,5.5));
		System.out.println(Calculate.average(4.5,5.5,6.5));
		System.out.println(Calculate.toDegrees(3.14));
		System.out.println(Calculate.toRadians(90));
		System.out.println(Calculate.discriminant(1,0,0));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2,3,9,-7,"n"));
		System.out.println(Calculate.isDivisibleBy(4,4));
		System.out.println(Calculate.absValue(-5));
		System.out.println(Calculate.max(2,3));
		System.out.println(Calculate.max(1,2,0));
		System.out.println(Calculate.min(1,2));
		System.out.println(Calculate.round2(-1234.596));
		System.out.println(Calculate.exponent(1.5,3));
		System.out.println(Calculate.factorial(5));
		System.out.println(Calculate.isPrime(5));
		System.out.println(Calculate.gcf(12,24));
		System.out.println(Calculate.sqrt(0));
		System.out.println(Calculate.quadForm(3,4,10));
	}
}
