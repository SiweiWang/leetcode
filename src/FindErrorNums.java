/**
 * Created by siweiwang on 2017-11-09.
 */
public class FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int [] res = new int [2];
        for (int i : nums){
            if ( nums[Math.abs(i) -1 ] < 0 ){
                res[0] = i;
            }else{
                nums[Math.abs(i) -1 ] *= -1;
            }

        }

        for (int i = 0; i < nums.length; ++ i){
            if (nums[i] > 0) {
                res[1] = i + 1;
            }
        }
        return res;
    }
}
