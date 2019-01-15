package Questions;

import java.util.Arrays;

public class Anagram {
	public static void main(String args[]) {
		String str = "ABCDA";
		String str1 = "BACDA";
		
		char arr1[] = str.toCharArray();
		char arr2[] = str1.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)) {
			System.out.println("Arrays are anagram");
		}
		else
			System.out.println("Arrays are not anagram");
		
	}
}
