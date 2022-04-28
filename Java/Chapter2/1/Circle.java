import java.lang.Math;
public  class Circle{
	public double r;

	public static double perimeter(double r){
		double per;
		per=2*r*Math.PI;
		return per;		
	}		

	public static double area(double r){
		double area;
		area=Math.PI*r*r;
		return area;	
	}
}
