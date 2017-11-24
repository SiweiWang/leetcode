/**
 * Created by siweiwang on 2017-11-23.
 */
public class RepeatedStringMatch {
    public int repeatedStringMatch(String A, String B) {
        String t = A;
        int count = 1;
        while(t.length() < B.length()){
            t = t + A;
            ++ count;
        }
        if (t.indexOf(B) >= 0){
            return count;
        }
        t = t + A;
        return t.indexOf(B) >=0 ? ++count: -1;
    }
}
