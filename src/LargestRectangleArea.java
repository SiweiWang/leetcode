import java.util.Stack;
import java.util.ArrayList;
/**
 * Created by siweiwang on 2017-05-29.
 */
public class LargestRectangleArea {
    public static void main(String[] args){
        LargestRectangleArea lra = new LargestRectangleArea();
        int[]  nums = {2,1,5,6,2,3};
        System.out.print(lra.largestRectangleArea(nums));
    }

    public int largestRectangleArea(int[] heights){
        Stack<Integer> stack = new Stack<Integer>();
        // push the last length as 0
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int result=0;

        for (int i = 0; i < heights.length; i++){
            nums.add(heights[i]);
        }
        nums.add(0);
        for (int i = 0; i< nums.size();){
            if(stack.empty() || nums.get(i) > nums.get(stack.peek())){
                stack.push(i++);
            }else {
                int width = stack.peek();
                stack.pop();
                int length = stack.empty()? i : i - stack.peek() - 1;

                result= Math.max(result, nums.get(width) * length);
            }
        }
        return result;
    }
}
