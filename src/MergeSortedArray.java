import java.util.Arrays;
/**
 * Created by siweiwang on 2017-10-28.
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if ( m == 0 && n == 0) { return ;}
        int length = m + n -1;
        m --;
        n --;
        while ( length >= 0){
            if (m >= 0 && n >= 0 ){
                if (nums1[m] > nums2[n]){
                    nums1[length--] = nums1[m--];
                }else {
                    nums1[length--] = nums2[n--];
                }
            }else{
                if (m >= 0){
                    nums1[length--] = nums1[m--];
                }else {
                    nums1[length-- ] = nums2[n--];
                }
            }
        }
    }
}
