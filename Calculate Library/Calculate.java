//this class has math methods
//Ben Gu
//9/24/2018
//Version 1
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
		return (a*c+f+"^2"+" + "+(a*d+b*c)+f+" + "+b*d);
	}
	public static Boolean isDivisibleBy(int a, int b){
		if (b==0) {throw new IllegalArgumentException ("denominator cannot be zero");}
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
		if (a>=b && a>=c) {
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
		if(a>=0) {
		if ((a*100)%1>=0.5) {
			return (a*100+1-((a*100)%1))/100;
		}else {
			return (a*100-((a*100)%1))/100;
		}
		}else {
			if ((-a*100)%1>=0.5) {
				return (a*100+1-((a*100)%1))/100-0.02;
			}else {
				return (a*100-((a*100)%1))/100;
			}
		}
	}
	//return a value to a positive integer power
	public static double exponent (double a, int b) {
		if (b<=0) {throw new IllegalArgumentException ("need a positive number for the exponent");}
		double results=a;
		for(int times=1; times!=b; times++) {
			results=results*a;
		}
		return results;
	}
	//return the factorical of an integer
	public static int factorial (int a) {
		if (a<=0) {throw new IllegalArgumentException ("need a positive number for the factorial");}
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
		int result=1;
		for (int c=a; Calculate.isDivisibleBy(a,c)==true && Calculate.isDivisibleBy(b,c)==true; c--) {
			result=c;
				}
		return result;
		}
	//return the square root of a double
	public static double sqrt (double a) {
		if (a<0) {throw new IllegalArgumentException ("only positive number can be square rooted");}
		double resulta=0;
		for (int root=0; root*root<=(a*1000000); root=root+100) {
			resulta=root/1000.0;
		}
		double resultb=resulta+0.01;
		if((a-resulta*resulta)<=(resultb*resultb-a)){
			return Calculate.round2(resulta);
		}else {
			return Calculate.round2(resultb);
		}
	}
	//return a String about the roots of a quadratic equition
	public static String quadForm (double a, double b, double c) {
		if (a==0) {throw new IllegalArgumentException ("a cannot be zero");}
		double firstpart=-0.5*b/a;
		if (Calculate.discriminant(a,b,c)<0) {
			return ("no real roots");
		}
		if (Calculate.discriminant(a,b,c)==0) {
			double resulta=Calculate.round2(firstpart);
			return (resulta+"");
		}
		if (Calculate.discriminant(a,b,c)>0) {
			double resultb=Calculate.round2((-1*b+Calculate.sqrt(Calculate.discriminant(a,b,c)))/(2*a));
			double resultc=Calculate.round2((-1*b-Calculate.sqrt(Calculate.discriminant(a,b,c)))/(2*a));
			return (resultb+"and"+resultc);
		}
		return"";
	}
}
	

