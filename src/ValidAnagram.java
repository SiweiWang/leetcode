/**
 * Created by siweiwang on 2017-10-22.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        char [] s_list = s.toCharArray();
        char [] t_list = t.toCharArray();
        if (s_list.length != t_list.length) {
            return false;
        }
        int [] list = new int [26];

        for (char c : s_list){
            list[c - 'a'] += 1;
        }
        for (char c: t_list){
            list[c - 'a'] -= 1;
            if (list[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }

}
