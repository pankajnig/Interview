package Questions;

public class RepeatedNonRepeatedchar {
	public static void main(String args[]) {
		String s= "how to convert string to integer";
		boolean non =true;
		char ch[] = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(s.indexOf(ch[i])>i) {
				System.out.println("First repeated charcter   :"+ch[i]);
			}
			else if(non) {
				System.out.println("First non repeated charcter   :"+ch[i]);
				non=false;
			}
		}
		
		
	}
}
