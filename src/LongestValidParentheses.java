import java.util.Stack;
/**
 * Created by siweiwang on 2017-05-29.
 */
public class LongestValidParentheses {
    public static void main(String[]  args){
        LongestValidParentheses lvp = new LongestValidParentheses();
        System.out.print(lvp.LongestValidParentheses(")"));
    }

    public int LongestValidParentheses(String s){
        int max_len=0;
        int last=-1;
        Stack<Integer> lefts = new Stack<Integer>();
        for (int i = 0; i < s.length(); i ++){
            if (s.charAt(i) == '('){
                lefts.push(i);
            }else{
                if (lefts.empty()){
                   // no matching left, remember the last valid position;
                    last = i;
                }else {
                    // find a matching pair
                    lefts.pop();
                    if (lefts.empty()){
                        max_len=Math.max(max_len, i-last);
                    }else{
                        max_len=Math.max(max_len, i-lefts.peek());
                    }
                }

            }
        }
        return max_len;
    }
}
