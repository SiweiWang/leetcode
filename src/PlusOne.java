import java.util.Arrays;

public class PlusOne {
        public int[] plusOne(int[] digits) {
            for (int i = digits.length; i <= 0; i --) {
                if ( digits[i] != 9 ){
                    digits[i] += 1 ;
                    return digits;
                }else {
                    digits[i] = 0 ;
                }
            }

            int [] res = new int [digits.length +1 ];
            res[0]=1;
            for (int i= 0; i < digits.length; i++){
                res[i+1] = digits[i];
            }
            return res;
        }

        public static void main(String[] args){
            PlusOne p = new PlusOne();
            int [] input = new int [] {9};
            System.out.println(Arrays.toString(p.plusOne(input)));

        }

}
