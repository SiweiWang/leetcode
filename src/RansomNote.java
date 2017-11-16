import java.util.HashMap;

/**
 * Created by siweiwang on 2017-11-14.
 */
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        char [] mag_list = magazine.toCharArray();
        for (char c: mag_list){
            if (map.containsKey(c)){
                map.put(c, map.get(c) +1);
            }else{
                map.put(c, 1);
            }
        }

        char [] ransom_list = ransomNote.toCharArray();
        for (char c : ransom_list){
            if (map.containsKey(c) && map.get(c) > 0){
                map.put(c, map.get(c) - 1);
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String [] args){
        RansomNote r = new RansomNote();
        System.out.println(r.canConstruct("aa", "aab"));
    }

}
