//calculate methods in quadratic
//Client code for quadratic
//Ben Gu
//10/05/2018
//Version 1
import java.util.Scanner;
	
public class QuadraticClient {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("a=");
		double a= input.nextDouble();
		System.out.println(a);
		System.out.print("b=");
		double b= input.nextDouble();
		System.out.println(b);
		System.out.print("c=");
		double c= input.nextDouble();
		System.out.println(c);
		
		System.out.println(Quadratic.quadrDescriber(a, b, c));
	}
}
