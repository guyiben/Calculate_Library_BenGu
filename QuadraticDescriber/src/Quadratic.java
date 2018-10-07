//this class has math methods
//Ben Gu
//9/24/2018
//Version 1


public class Quadratic {
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
		
//return the discriminant of a quadratic quation
	public static double discriminant(double a, double b, double c){
		return (b*b-4*a*c);
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
			return Quadratic.round2(resulta);
		}else {
			return Quadratic.round2(resultb);
		}
	}
	
//return a String about the roots of a quadratic equition
		public static String quadForm (double a, double b, double c) {
			if (a==0) {throw new IllegalArgumentException ("a cannot be zero");}
			double firstpart=-0.5*b/a;
			if (Quadratic.discriminant(a,b,c)<0) {
				return ("no real roots");
			}
			if (Quadratic.discriminant(a,b,c)==0) {
				double resulta=Quadratic.round2(firstpart);
				return (resulta+"");
			}
			if (Quadratic.discriminant(a,b,c)>0) {
				double resultb=Quadratic.round2((-1*b+Quadratic.sqrt(Quadratic.discriminant(a,b,c)))/(2*a));
				double resultc=Quadratic.round2((-1*b-Quadratic.sqrt(Quadratic.discriminant(a,b,c)))/(2*a));
				return (resultb+"and"+resultc);
			}
			return"";
		}

	//return describtion
	public static String quadrDescriber (double a, double b, double c) {
		String z="description of graph of: y=" + a +"x^2" + b + "x" + c;
		String v=("x-intercept(s):"+ Quadratic.quadForm (a, b, c));
		String u="y-intercept:"+ c;
		if (a>0) {
			String y="open: up";
		}
		if (a<0) {
			String y="open: down";
		}
		String y="";
		double d= b/-2/a;
		String x= "axis of symmetry:" + d;
		double e= a*d*d+b*d+c;
		String w= "vertex:(" + d + "," + e + ")";
		
		return (z \n y \n x \n x \n w \n v \n u);
				

}
}
