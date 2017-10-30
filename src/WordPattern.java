import java.util.HashMap;

/**
 * Created by siweiwang on 2017-10-23.
 */
public class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String [] result = str.split("\\s");
        char [] list = pattern.toCharArray();
        if (result.length != list.length) { return false; }
        HashMap<Character, String> map = new HashMap<Character, String>();
        HashMap<String, Character> revmap = new HashMap<String, Character>();
        for (int i = 0; i < result.length; i ++ ){
            if (map.containsKey(list[i])){
                if (!map.get(list[i]).equals(result[i])) {
                    return false;
                }
            }else {
                map.put(list[i], result[i]);
            }

            if (revmap.containsKey(result[i])){
                if (revmap.get(result[i]) != list[i]){
                    return false;
                }
            }else {
                revmap.put(result[i], list[i]);
            }
        }

        return true;
    }
    public static void main (String [] args){
        WordPattern w = new WordPattern();
        System.out.println(w.wordPattern("abba","dog cat cat dog"));
    }
}
