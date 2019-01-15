package Questions;

import java.util.Scanner;

public class NumberPyramid {
	public static void main(String args[]) {
		int num=1;
		System.out.println("How many rows you want  :");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		for(int i=1;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(num+" ");
			}
			System.out.println();
			num++;
		}
	}
}
