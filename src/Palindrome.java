import java.util.Scanner;

public class Palindrome {
	public static boolean Palindromep() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.nextLine();
		int length = str.length();
		for(int i=0;i<length/2;i++) {
			if(str.charAt(i)!=str.charAt(length-1-i)) {
				System.out.println("String is not palindrome");
				return false;
			}
			
		}
		System.out.println("String is palindrome");
		return true;
	}
	
	public static void palindrome2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string :");
		String str = sc.nextLine();
		boolean flag =true;
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[arr.length-1-i]) {
				flag=true;
			}
			else {
				flag=false;
				break;
			}
			
			
		}
		if(flag) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}
	
	public static void main(String args[]) {
	
		palindrome2();
	}
}
