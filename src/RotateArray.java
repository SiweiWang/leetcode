import java.util.Arrays;

/**
 * Created by siweiwang on 2017-11-05.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        int [] a = new int [nums.length];
        for (int i = 0; i < nums.length; i ++ ){
            a[(i+k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i ++){
            nums[i] = a[i];
        }
    }



}
