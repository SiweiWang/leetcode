/**
 * Created by siweiwang on 2017-10-22.
 * https://leetcode.com/problems/sum-of-square-numbers/description/
 */

public class SumOfSquareNumbers {
    public boolean judgeSquareSum(int c) {
        int root = (int)Math.sqrt((double) c);
        for (int i = 0; i <= root;){
            if (i * i + root * root == c) return true;
            else if (i * i + root * root < c){ ++i; }
            else --root;
        }
        return false;
    }

    public static void main(String []  args){
        SumOfSquareNumbers s = new SumOfSquareNumbers();
        System.out.println(s.judgeSquareSum(3));

    }
}
