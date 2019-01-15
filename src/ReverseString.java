import java.util.Scanner;

public class ReverseString {
	public static void Reverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.nextLine();
		
		char arr[] = str.toCharArray();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
	}
	
	public static void builderReverse() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.nextLine();
		
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb.toString());
	}
	
	public static void main(String args[]) {
		builderReverse();
	}
}
