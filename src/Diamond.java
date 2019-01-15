class Diamond{
public static void printDiamond(){
System.out.println("\t\t       *");
for(int i=0;i<=10;i++){
for(int j=10;j>=i;j--){
System.out.print("  ");
}
for(int k=0;k<=i;k++){
System.out.print("* ");
}
for(int l=0;l<=i;l++){
System.out.print("* ");
}
System.out.println();
};


for(int i=0;i<=10;i++){
for(int j=0;j<=i;j++){
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
System.out.println("\t\t       *");

}

public static void printTriangle() {
	for(int i=1;i<=10;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
}

public static void printNumberPyramid() {
	int count=1;
	for(int i=1;i<=10;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(count++ +" ");
		}
		System.out.println();
		
	}
}


public static void reverseTriangle() {
	for(int i=0;i<=10;i++) {
		for(int j=10;j>=i;j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
}

public static void triangle() {
	System.out.println("                     *");
	for(int i=1;i<=10;i++) {
		for(int j=10;j>=i;j--) {
			System.out.print("  ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print("* ");
		}
		for(int n=1;n<=i;n++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}

public static void numberTriangle() {
	int count=1;
	System.out.println("            "+count++);
	for(int i=0;i<=5;i++) {
		for(int j=5;j>i;j--) {
			System.out.print("  ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print(count++ +" ");
		}
		for(int n=0;n<=i;n++) {
			System.out.print(count++ +" ");
		}
		System.out.println();
	}
}

public static void printReverseTriangle() {
	for(int i=0;i<10;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("  ");
		}
		
		for(int k=10;k>i;k--) {
			System.out.print("* ");
		}
		for(int l=10;l>i;l--) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println("                   *");
}

	public static void reversePyramid2() {
		System.out.println("                     *");
		for(int i=1;i<=10;i++) {
			for(int j=10;j>=i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			for(int n=1;n<=i;n++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int k=10;k>=i;k--) {
				System.out.print("* ");	
				}
		
		for(int l=10;l>=i;l--) {
			System.out.print("* ");
		}
		System.out.println();
		}
		System.out.println("                     *");
	}
	
	
public static void main(String args[]){
//printDiamond();
//printTriangle();
//reverseTriangle();
	//triangle();
	//printReverseTriangle();
	//printNumberPyramid();
	reversePyramid2();
}

}
