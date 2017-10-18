/**
 * Created by siweiwang on 2017-06-27.
 */
public class MaximumProduct {
    public static void main(String[] s){
        MaximumProduct max = new MaximumProduct();
        System.out.println(max.maximumProduct(new int[]{-1,-2,-3}));
    }
    public int maximumProduct(int[] nums) {
        int positive_a=Integer.MIN_VALUE, positive_b=Integer.MIN_VALUE, positive_c=Integer.MIN_VALUE;
        int negative_a=Integer.MAX_VALUE, negative_b=Integer.MAX_VALUE;
        for (int n : nums){
            if (n > positive_a) {
                positive_c=positive_b;
                positive_b = positive_a;
                positive_a=n;
            }else if(n > positive_b){
                positive_c = positive_b;
                positive_b=n;
            }else if(n > positive_c){
                positive_c=n;
            }

            if (n < negative_a){
                negative_b=negative_a;
                negative_a=n;
            }else if (n < negative_b){
                negative_b=n;
            }
        }

        return Math.max(positive_a * positive_b * positive_c, positive_a * negative_a * negative_b);
    }
}
