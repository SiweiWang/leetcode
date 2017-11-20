/**
 * Created by siweiwang on 2017-11-19.
 */
public class MinMoves {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        int result = 0;
        for (int i : nums) {
            min = Math.min(min, i);
        }
        for (int i : nums) {
            result += i - min;
        }

        return result;
    }
}