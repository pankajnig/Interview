import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;



public class StringQuestion {
	public static void duplicateCharacter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String  :");
		String str = sc.nextLine();
		
		Map<Character, Integer> map = new <Character, Integer>HashMap();
		
		char[] arr = str.toCharArray();
		
		for(char ch : arr) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		
		Set<Map.Entry<Character, Integer>> entrySet = map.entrySet();
	//	System.out.printf("List of duplicate characters in String '%s' %n", arr);
		for (Map.Entry<Character, Integer> entry : entrySet) { 
			if (entry.getValue() > 1)
			{ 
				System.out.println(entry.getKey()+"   "+ entry.getValue()); 
				}
		}

		
		//System.out.println(map);
		
	}
	
	public static void anagram() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String  :");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		char[] arr = str1.toCharArray();
		
		for(char ch : arr) {
			int i = str2.indexOf(ch);
			if(i!=-1) {
				str2 = str2.substring(0,i)+str2.substring(i+1,str2.length());
				System.out.println(str2);
			}
			else {
				break;
			}
			
		}
		if(str2.length()==0)
			System.out.println("String is anagram");	
		else
			System.out.println("String is not anagram");	
		
	}
	
	public static void anagram2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String  :");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		char[] arr = str1.toCharArray();
		char[] arr1 = str2.toCharArray();
		
		if(arr.length==arr1.length) {
			for(int i=0;i<arr.length;i++) {
				for(int j=arr.length-1;j>=0;j--) {
					if(arr[i]==arr[j]) {
						System.out.println("anagram");
					}
					else {
						System.out.println("not anagram");
						break;
					}
					i++;
				}
			}
		}else {
			System.out.println("not anagram");
		}
	}
	
	public static void main(String args[]) {
		//duplicateCharacter();
		anagram2();
	}
}
