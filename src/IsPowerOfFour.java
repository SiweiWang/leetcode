/**
 * Created by siweiwang on 2017-11-13.
 */
public class IsPowerOfFour {
    public boolean isPowerOfFour(int num) {
        return num > 0 && ((num & (num -1)) == 0) && ((num & 0x55555555) == num);
    }
}
