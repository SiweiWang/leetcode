/**
 * Created by siweiwang on 2017-11-15.
 */
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int total = 0;
        char [] list = s.toCharArray();
        int [] hash = new int [256];
        for (char c: list){
            hash[c] += 1;
        }
        for (int i: hash){
            if (i % 2 == 0  ){
                total += i;
            }else if ( i > 1){
                total = total + (i -1);
            }
        }
        if (total < s.length()){
            total +=1;
        }
        String test = Character.toString('a') + "test";
        return total;
    }
}
