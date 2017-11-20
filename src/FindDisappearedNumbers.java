import java.util.ArrayList;
import java.util.List;

/**
 * Created by siweiwang on 2017-11-19.
 */
public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int [] list = new int[nums.length];
        for (int i: nums){
            list[i-1] += 1;
        }
        Integer.MIN_VALUE
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < list.length; i ++){
            if (list[i] == 0){
                res.add(i+1);
            }
        }

        return res;
    }
}
