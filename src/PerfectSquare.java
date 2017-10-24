/**
 * Created by siweiwang on 2017-10-23.
 */
public class PerfectSquare {
    public boolean isPerfectSquare(int num) {
        int i = 1;
        while (num > 0) {
            num -= i;
            i += 2;
        }
        return num == 0;
    }
}
