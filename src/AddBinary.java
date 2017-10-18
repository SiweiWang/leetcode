import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by siweiwang on 2017-06-05.
 */
public class AddBinary {
    public static void main(String[] args){
        AddBinary add = new AddBinary();
        System.out.println(add.addBinary("", "111"));
    }

    public String addBinary (String a, String b){
        ArrayList<Character> result = new ArrayList<Character>();

        if (a.isEmpty() && b.isEmpty()) return "0";
        if (a.isEmpty()) return b;
        if (b.isEmpty()) return a;
        int size = a.length() > b.length() ? a.length() : b.length();
        char[] a_list = a.toCharArray();
        char[] b_list = b.toCharArray();

        reverse(a_list);
        reverse(b_list);

        int carry = 0;
        for (int i =0 ; i < size; i ++){
            int a_val = i < a_list.length ? a_list[i] - '0' : 0;
            int b_val = i < b_list.length ? b_list[i] - '0' : 0;
            int val = (a_val + b_val + carry ) % 2;
            carry = (a_val + b_val + carry ) / 2;
            result.add(val == 0 ? '0' : '1');
        }
        if (carry == 1){
            result.add('1');
        }

        Collections.reverse(result);
        char[] c = new char [result.size()];
        for (int i =0; i < result.size(); i ++) {
            c[i] = result.get(i);
        }

        return new String (c);
    }

    private void reverse (char [] a){
        if (a.length < 2) return;
        for (int i = 0,j = a.length -1; i < j; i++, j--){
            char temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}
