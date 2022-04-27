import java.util.Scanner;

public class indexof{
	public static void main(String[] args){
		String s1;
		Scanner stdIn=new Scanner(System.in);
		System.out.println("Please input the string that you want to find:");
		s1=stdIn.next();
		
		int flag=s1.indexOf("abc");

		if(flag==-1){
			System.out.println("This string don't include \"abc\".");
		}
		else{
			System.out.println("This string include \"abc\".");
		}
	}
}
