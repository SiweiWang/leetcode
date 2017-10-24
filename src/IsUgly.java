/**
 * Created by siweiwang on 2017-10-23.
 */
public class IsUgly {
    public boolean isUgly(int num) {
        if (num <= 0 ) { return false; }
        while (num % 2 == 0) { num /= 2;}
        while (num % 3 == 0) { num /= 3;}
        while (num % 5 == 0) { num /= 5;}
        return num == 1;
    }
}
