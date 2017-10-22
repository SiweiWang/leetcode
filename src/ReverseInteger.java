/**
 * Created by siweiwang on 2017-10-21.
 */
public class ReverseInteger {
    public int reverse(int x) {
        long reverseInt = 0;

        long input = x;

        while (input != 0){
            reverseInt = reverseInt * 10 + input % 10;
            input = input /10;
        }

        if (reverseInt > Integer.MAX_VALUE || reverseInt < Integer.MIN_VALUE){
            return 0;
        }

        return (int)reverseInt;
    }
}
