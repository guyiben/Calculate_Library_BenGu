//this class has math methods
//Ben Gu
//9/6/2018
//Version 0
public class Calculate {
	
	// returns the square of an integer
	public static int square(int number){
		return number*number;
	}
	// return the cube of an integer
	public static int cube(int number){
		return number*number*number;
	}
	// return the average of 2 doubles
	public static double average(double number1,double number2){
		return (number1+number2)/2;
	}
	//return the average of 3 doubles
	public static double average(double number1,double number2,double number3){
		return (number1+number2+number3)/3;
	}
	//return the angle measure from radians measure
	public static double toDegrees(double rad){
		return (rad/3.14159*180);
	}
	//return the radians measure from angle measure
	public static double toRadians(double deg){
		return (deg*3.14159/180);
	}
	//return the discriminant of a quadratic quation
	public static double discriminant(double a, double b, double c){
		return (b*b-4*a*c);
	}
	//convert a mixed number into an improper fraction
	public static String toImproperFrac(int a, int b, int c){
		int num=(a*c+b);
		int den=c;
		return (num+"/"+den);
	}
	//concert an improper fraction into a mixed number
	public static String toMixedNum(int a, int b){
		int whole=(a-a%b)/b;
		int num=a%b;
		int den=b;
		return (whole+"_"+num+"/"+den);
	}
	//convert a binomial multiplication of the form (ax+b)(cx+d) into a quadratic equation of the form ax^2+bx+c
	public static String foil(int a, int b, int c, int d, String f){
		return (a*c+f+"^2"+"+"+(a*d+b*c)+f+"+"+b*d);
	}
	public static Boolean isDivisibleBy(int a, int b){
		if (a%b==0) {
			return (true);
		}else {
			return (false);
		}
	}
	//return an absolute value of a double
	public static double absValue(double a) {
		if (a>=0) {
			return a;
		}else{
			return a*-1;
		}
	}
	//return the greatest double from 2 doubles
	public static double max (double a, double b) {
		if (a>=b) {
			return a;
		}else {
			return b;
		}
	}
	//return the greatest double from 3 doubles
	public static double max (double a, double b, double c) {
		if (a>b && a>c) {
			return a;
		}
		if (b>c && b>a) {
			return b;
		}else {
			return c;
		}
	}
	//return the least double from 2 doubles
	public static int min (int a, int b) {
		if (a<=b) {
			return a;
		}else {
			return b;
		}
	}
	//return a double that is rounded into 2 decimal places
	public static double round2 (double a) {
		if ((a*100)%1>=0.5) {
			return (a*100+1-((a*100)%1))/100;
		}else {
			return (a*100-((a*100)%1))/100;
		}
	}
	//return a value to a positive integer power
	public static double exponent (double a, int b) {
		double results=a;
		for(int times=1; times!=b; times++) {
			results=results*a;
		}
		return results;
	}
	//return the factorical of an integer
	public static int factorial (int a) {
		int result=a;
		for(int multi=1; multi!=a; multi++) {
			result=result*multi;
		}
		return result;
	}
	//return a boolean show if a number is a prime
	public static boolean isPrime (int a) {
		for(int b=2;b<a;b++) {
			if(Calculate.isDivisibleBy(a,b)==true) {
				return false;
			}
		}
		return true;		
	}
	//return the greatest common factor
	public static int gcf (int a, int b) {
		for (int c; c<=a; c++)
			
	}
}
	

