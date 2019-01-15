import java.util.Scanner;

public class Armstrong {
	public static void reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		int str = sc.nextInt();
		int p = str;
		int a=0;
		int sum=0;
		do {
			a=str%10;
			sum = sum + a*a*a;
			str=str/10;
		}
		
		while(str>0);
		if(p==sum) {
			System.out.println("Number is armstrong  "+p+"  "+sum);
		}
		else{
			System.out.println("Number is not armstrong  "+p+"  "+sum);
		}
		}
	//Edited though github
	public static void main(String args[]) {
		reverse();
	}
}
