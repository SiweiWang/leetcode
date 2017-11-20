/**
 * Created by siweiwang on 2017-11-19.
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int max = Math.max(x, y);
        int res = 0;
        while (max > 0){
            if (x % 2 != y % 2){
                res += 1;
            }

            x = x >> 1;
            y = y >> 1;
            max = max >> 1;
        }
        return res;
    }
}
