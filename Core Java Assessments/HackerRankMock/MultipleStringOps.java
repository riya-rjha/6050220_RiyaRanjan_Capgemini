import java.util.*;

public class MultipleStringOps {

    static Map<Character, Character> nextVowel;

    public static String processString(String str, int k) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            if (nextVowel.containsKey(ch)) {
                sb.setCharAt(i, nextVowel.get(ch));
            }
        }

        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < sb.length(); i++) {
            if (Character.isAlphabetic(sb.charAt(i))) set.add(sb.charAt(i));
        }

        sb = new StringBuilder("");
        for(char c: set) {
            sb.append(c);
        }

        // System.out.println(sb); // ulih

        StringBuilder ans = new StringBuilder("");
        for (int i = k; i < sb.length(); i++) {
            ans.append(sb.charAt(i));
        }

        for (int i = 0; i < k; i++) {
            ans.append(sb.charAt(i));
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        String str = "world 3";
        // String str = "hello 2";
        nextVowel = new HashMap<>();
        nextVowel.put('a', 'e');
        nextVowel.put('e', 'i');
        nextVowel.put('i', 'o');
        nextVowel.put('o', 'u');
        nextVowel.put('u', 'a');
        System.out.println(processString(str, 2));
    }
}
