import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
		
		public static String getString() {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			return str;
		}
		
		public static void sortString() {
			String s = "abc123efg234";
			
			//Pattern pattern = Pattern.compile("[a-z](.[0-9]?)[a-z]");
			//Matcher match = pattern.matcher(s);
			//System.out.println(match.matches());
		String str = s.replaceAll("[\\D]","");
			System.out.println(str);
			
		}
		
	public static void main(String args[]) {
		sortString();
	}
	
}
