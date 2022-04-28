import java.util.Scanner;

class ShapeTester{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
	
		Circle circle=new Circle();	
		System.out.print("Please input a number as radius:");
		circle.r=stdIn.nextDouble();
		System.out.println("The perimeter of the Circle is:"+Circle.perimeter(circle.r));
		System.out.println("The area of the Circle is:"+Circle.area(circle.r));	
	}

}
