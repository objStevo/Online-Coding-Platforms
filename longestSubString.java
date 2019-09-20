import java.util.HashMap;

public class longestSubString {
    static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> subStringSet = new HashMap <>();
        int indexStartOfSubString = 0;
        int currentSizeOfSubString = 0;
        int max = 1;

        if(s.length()==0)
            return 0;

        for (int i = 0;i < s.length();i++){

            if ((subStringSet.containsKey(s.charAt(i)))&&(subStringSet.get(s.charAt(i))>=indexStartOfSubString)){

                indexStartOfSubString = subStringSet.get(s.charAt(i)) + 1;
                max = (currentSizeOfSubString > max) ? currentSizeOfSubString : max;
            }
            currentSizeOfSubString = i - indexStartOfSubString + 1;
            subStringSet.put(s.charAt(i),i);


        }

        return (currentSizeOfSubString>max) ? currentSizeOfSubString : max;

    }

    public static void main(String[] args) {
        System.out.println("dvdf = " + lengthOfLongestSubstring("dvdf"));
        System.out.println("bbbb = " + lengthOfLongestSubstring("bbbb"));
        System.out.println("abcabcbb = " + lengthOfLongestSubstring("abcabcbb"));

    }
}
