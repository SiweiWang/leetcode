import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by siweiwang on 2017-11-12.
 */
public class IntersectII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int [] list = nums1;
        for (int i : list ){
            if (hash.containsKey(i)){
                hash.put(i, hash.get(i) + 1);
            }else{
                hash.put(i, 1);
            }
        }
        List<Integer> res = new ArrayList<>();

        for (int i : nums2){
            if (hash.containsKey(i) && hash.get(i) > 0){
                res.add(i);
                hash.put(i, hash.get(i) - 1);
            }
        }
        int [] result = new int [res.size()];
        int index = 0;
        for ( int i : res){
            result[index++] = i;
        }
        return result;
    }
}
