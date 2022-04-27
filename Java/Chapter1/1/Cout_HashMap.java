import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cout_HashMap{
	public static void main(String[] args){
	Map<String,Integer> Hash=new HashMap<String,Integer>();
	Scanner stdIn=new Scanner(System.in);
	
	String data=stdIn.nextLine();
	String s;
	String[] a=new String[100];
	a=data.split(" ");
	
	int len=a.length;
	int num=0;

	for(int i=0;i<len;i++){
		s=a[i];
		if(Hash.containsKey(s)){
			num=Hash.get(s);
			num=num+1;
		}
		else{
			num=1;
			}
		Hash.put(s,num);
		}
	System.out.print(Hash);
	}
}
