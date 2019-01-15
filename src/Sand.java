
public class Sand {
	public static void printDiamond(){
				
		for(int i=0;i<=10;i++){
		for(int j=0;j<i;j++){
		System.out.print("  ");
		}
		for(int k=10;k>=i;k--){
		System.out.print("* ");
		}
		for(int l=10;l>=i;l--){
		System.out.print("* ");
		}
		System.out.println();

		}
		System.out.println("\t\t     *");
		for(int i=0;i<=10;i++){
		for(int j=10;j>i;j--){
		System.out.print("  ");
		}
		for(int k=0;k<=i;k++){
		System.out.print("* ");
		}
		for(int l=0;l<=i;l++){
		System.out.print("* ");
		}
		System.out.println();
		}
		}
	public static void main(String args[]){
		printDiamond();
		}
}
