
public class Fibonacci {
			public static void main(String args[]) {
				int i=1;
				int j=1;
				int k=0;
				System.out.print(i+"\t");
				for(int l=0;l<6;l++) {
					System.out.print(j+ "\t");
					
					k=j;
					j=i+j;
					i=k;
				}
			}
}
