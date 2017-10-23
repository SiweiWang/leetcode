import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by siweiwang on 2017-10-22.
 */
public class ThirdMax {
    public int thirdMax(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int count = 0;
        boolean hasseen = false;
        for  (int i = 0; i < nums.length; i++){
            if (nums[i] == Integer.MIN_VALUE && !hasseen){
                count ++;
                hasseen = true;
            }

            if (nums[i] == max1 || nums[i] == max2 || nums[i] == max3){
                continue;
            } else if ( nums[i] > max1){
                count ++;
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }else if ( nums[i] > max2 ) {
                count ++;
                max3 = max2;
                max2 = nums[i];
            } else if (nums[i] > max3) {
                count ++;
                max3 = nums[i];
            }
        }

        return count < 3 ? max1 : max3;
    }
    public static void main (String[] args){
        ThirdMax t = new ThirdMax();
        System.out.println(t.thirdMax(new int[] {2,1}));
    }
}
