package Questions;

public class ReplaceWhite {
	
	public static void white() {
		String str = "Hello new world";
		String str2 = str.replaceAll("\\s","");
		System.out.println(str2);
	}
	
	public static void white2() {
		String str = "Hello new world";
		char arr[] = str.toCharArray();
		String str2 = "";
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=' ') {
				str2=str2+arr[i];
			}
		}
		System.out.println(str2);
	}
	public static void main(String args[]) {
		white();
	}
}
