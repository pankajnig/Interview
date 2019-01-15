package Questions;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter {
	public static void main(String args[]) {
		String s = "Hello world";
		char arr[] = s.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(char ch : arr) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
	//	System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ "  "+ entry.getValue());
		}
	}
}
