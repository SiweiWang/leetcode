/**
 * Created by siweiwang on 2017-11-23.
 */
public class HasAlternatingBits {
    public boolean hasAlternatingBits(int n) {
        int start = n %2;
        n = n >>1;
        while(n > 0){
            if (n % 2 == start){
                return false;
            }
            start = n %2;
            n = n >>1;
        }

        return true;
    }
}
