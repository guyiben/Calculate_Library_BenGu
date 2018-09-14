//this class has math methods
//Ben Gu
//9/6/2018
//Version 0
public class Calculate {
	
	public static int square(int number){
		return number*number;
	}
	public static int cube(int number){
		return number*number*number;
	}
	public static double average(double number1,double number2){
		return (number1+number2)/2;
	}
	public static double average(double number1,double number2,double number3){
		return (number1+number2+number3)/3;
	}
	public static double toDegrees(double rad){
		return (rad/3.14159*180);
	}
	public static double toRadians(double deg){
		return (deg*3.14159/180);
	}
	public static double discriminant(double a, double b, double c){
		return (b*b-4*a*c);
	}
	public static String toImproperFrac(int a, int b, int c){
		int num=(a*c+b);
		int den=c;
		return (num+"/"+den);
	}
	public static String toMixedNum(int a, int b){
		int whole=(a-a%b)/b;
		int num=a%b;
		int den=b;
		return (whole+"_"+num+"/"+den);
	}
	public static String foil(int a, int b, int c, int d, char e){
		int number1=(a*c);
		char var=e;
		return (number1+var+"^2"+"+"+(a*d+b*c)+var+"+"+b*d);

	}
}