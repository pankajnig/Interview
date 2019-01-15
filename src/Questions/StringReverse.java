package Questions;

public class StringReverse {
	public void usingBuffer() {
		String s= "Hello";
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		System.out.println(s);
		System.out.println(sb);
	}
	
	public void usingArray() {
		String s= "Hello";
		char[] arr = s.toCharArray();
		String str="";
		for(int i=arr.length-1;i>=0;i--) {
			str = str+arr[i];
		}
		System.out.println(s);
		System.out.println(str);
	}
	
	public static void main(String args[]) {
		StringReverse sr  = new StringReverse();
		sr.usingBuffer();
		sr.usingArray();
	}
}
