import java.util.*;

public class S {

	private static Map<Character, List<Character>> dict = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        dict.put('2',new ArrayList<>(Arrays.asList('a', 'b', 'c')));
        dict.put('3',new ArrayList<>(Arrays.asList('d', 'e', 'f')));
        dict.put('4',new ArrayList<>(Arrays.asList('g', 'h', 'i')));
        dict.put('5',new ArrayList<>(Arrays.asList('j', 'k', 'l')));
        dict.put('6',new ArrayList<>(Arrays.asList('m', 'n', 'o')));
        dict.put('7',new ArrayList<>(Arrays.asList('p', 'q', 'r', 's')));
        dict.put('8',new ArrayList<>(Arrays.asList('t', 'u', 'v')));
        dict.put('9',new ArrayList<>(Arrays.asList('w', 'x', 'y', 'z')));
        dict.put('0',new ArrayList<>(Arrays.asList(' ')));
        Set<String> r = new HashSet<>();
        String digits = "23";
        char[] d = digits.toCharArray();
        bt(r, new StringBuilder(), d, 0);
        System.out.println(r);
	}

	private static void bt(Set<String> r, StringBuilder cur, char[] d, int index) {
        for (int i = index; i < d.length; i++) {
        	List<Character> charSet = dict.get(d[i]);
        	for(int j = 0; j < charSet.size(); j++) {
        		cur.append(charSet.get(j));
        		if (!cur.equals("") && !r.contains(cur.toString()) && cur.length() == d.length) {
            		r.add(cur.toString());
            	}
        		bt(r, cur, d, i + 1);
        		cur.deleteCharAt(cur.length() - 1);
        	}
        }
    }
}
