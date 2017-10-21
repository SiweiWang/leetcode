/**
 * Created by siweiwang on 2017-10-21.
 */
public class ReverseString {
    public String reverseString(String s) {
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
        ReverseString rev = new ReverseString();
        System.out.println(rev.reverseString("Hello"));
    }
}
