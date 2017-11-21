import java.util.Arrays;

/**
 * Created by siweiwang on 2017-11-20.
 */
public class ArrayPairSum {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i ++){
            if ( i % 2 ==0){
                result += nums[i];
            }
        }
        return result;
    }
}
