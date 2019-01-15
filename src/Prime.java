import java.util.Scanner;

public class Prime {
	
	public static boolean primeNo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no  :");
		int no = sc.nextInt();
		for(int i=2;i<no/2;i++) {
			if(no%i==0) {
				System.out.println("Number is not prime");
				return false;
			}
		}
		System.out.println("Number is prime");
		return true;
	}
	public static void  main(String args[]) {
		
		primeNo();
	}
}
