package reverse;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Occurance {
	public static void main(String[] args) {
		String s = "testing framework";
		Map<Character, Integer> mp = new LinkedHashMap<>();
		for (int i = 0; i <s.length(); i++) {
			char c = s.charAt(i);
			if (mp.containsKey(c)) {
				Integer in = mp.get(c);
				mp.put(c, in+1);	
			}
			else {
				mp.put(c, 1);
			}
			 Set<Entry<Character, Integer>> en = mp.entrySet();
		for (Entry<Character, Integer> e : en) {
			System.out.println(e);
			
		}
				
			}
			
		}
	}


