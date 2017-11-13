/**
 * Created by siweiwang on 2017-11-05.
 */
public class TrailingZeroes {
    public int trailingZeroes(int n) {
        int result = 0;
        while (n > 0){
            result += n/5;
            n = n/5;
        }
        return result;
    }
}
