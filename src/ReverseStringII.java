import java.util.HashMap;

/**
 * Created by siweiwang on 2017-10-21.
 */
public class ReverseStringII {
    public String reverseStr(String s, int k) {

        if (k ==1){
            return s;
        }

        String result = "";
        boolean is2k = false;
        while (!s.isEmpty()){

            k = k >= s.length()? s.length() : k;
            result = is2k? result + s.substring(0, k) : result + swap(s.substring(0, k));

            s = s.substring(k, s.length());

            is2k = !is2k;
        }

        if (!s.isEmpty()) {

            result = result + s;

        }

        return result;
    }

    private String swap(String s){
        char[] list = s.toCharArray();
        int i = 0;
        int j = list.length-1;

        while (i < j ){
            char temp = list [i];
            list [i] = list [j];
            list [j] = temp;
            i ++;
            j --;
        }

        return new String (list);
    }

    public static void main(String[] arg){
        ReverseStringII rev = new ReverseStringII();
        System.out.println(rev.reverseStr("abcdefg", 2));
    }
}
