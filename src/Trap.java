/**
 * Created by siweiwang on 2017-12-13.
 */

import java.util.Stack;

public class Trap {
    public int trap(int[] height) {
        Stack<Integer> s = new Stack<Integer>();
        int i = 0;
        int res = 0;
        int n = height.length;
        while(i < n){
            if (s.empty()|| height[i] <= height[s.peek()] ){
                s.push(i++);
            }else{
                int t = s.pop();
                if(s.empty()){
                    continue;
                }
                res += (Math.min(height[i], height[s.peek()]) - height[t] * (i - s.peek() -1));
            }
        }
        return res;
    }
}
