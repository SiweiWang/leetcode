import com.sun.tools.javac.code.Attribute;

/**
 * Created by siweiwang on 2017-06-02.
 */
public class lengthOfLongestSubstring {
    public static void main(String[] arg){
        lengthOfLongestSubstring l = new lengthOfLongestSubstring();
        System.out.print(l.lengthOfLongestSubstring("abcabccdbacdbacdbaaaaaa"));
    }

    public int lengthOfLongestSubstring(String s){
        final int MAX=26;
        int [] last = new int[MAX];
        // track the start point
        int start = 0;

        int max_len = 0;
        for (int i = 0; i < s.length(); i++){
            if (last[s.charAt(i) - 'a'] >= start ){
                max_len = Math.max(i - start, max_len);
                start = last[s.charAt(i) - 'a' ] + 1;
            }
            last [s.charAt(i) - 'a'] = i;
        }
        return max_len;
    }
}
