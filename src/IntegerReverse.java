import java.util.Scanner;

public class IntegerReverse {
	public static void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		int str = sc.nextInt();
		int a=0;
		int b=0;
		String strnm="";
		do {
		a=str%10;
		str=str/10;
		strnm=strnm+Integer.toString(a);
		}
		while(str>0);
		int n = Integer.parseInt(strnm);
		System.out.println(n);
	}
	
	public static void main(String args[]) {
		reverse();
	}
}
