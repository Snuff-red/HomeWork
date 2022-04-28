import java.util.Scanner;

class ShapeTester2{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		System.out.print("Which shape's area you want to calculate:(1--Rectangle/2--Triangle)");
		int flag=stdIn.nextInt();

		if(flag==1){
			Rectangle rec=new Rectangle();
			System.out.print("Please input the length:");
			rec.length=stdIn.nextDouble();
			System.out.print("Please input the width:");
			rec.width=stdIn.nextDouble();
			System.out.println("The area of the Rectangle is:"+rec.calArea());
		}
		else{
			Triangle tri=new Triangle();
			System.out.print("Please input the high:");
			tri.high=stdIn.nextDouble();
			System.out.print("Please input the base:");
			tri.base=stdIn.nextDouble();
			System.out.println("The area of the Triangle is:"+tri.calArea());

		}
	}
}
