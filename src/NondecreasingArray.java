/**
 * Created by siweiwang on 2017-11-09.
 */
public class NondecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int count = 1 ;
        for (int i = 1; i < nums.length; ++i) {
            if (nums[i] < nums[i - 1]) {
                if(count == 0){
                    return false;
                }else if ( i ==1 || nums[i] >= nums[i -2]) {
                    nums[i -1]= nums[i];
                    count --;

                }else{
                    nums[i] = nums[i-1];
                    count --;
                }
            }
        }
        return true;
    }
}
