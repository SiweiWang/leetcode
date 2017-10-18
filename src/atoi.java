import java.net.CacheRequest;

/**
 * Created by siweiwang on 2017-06-05.
 */
public class atoi {
    public static void main (String[] args){
        atoi a = new atoi();
        System.out.print(a.atoi("-2147483647"));
    }
    public int atoi (String s){
        int result = 0;
        s = s.trim();
        System.out.println(s);
        if (s.isEmpty()){
            return result;
        }
        int i = 0;
        int sign = 1;

        // Check atoi
        if( s.charAt(i)== '-'){
            sign = -1; i++;
        }else if( s.charAt(i) == '+'){
            sign = +1;  i++;
        }

        for (; i < s.length(); i++ ){
            if (s.charAt(i)< '0' || s.charAt(i) > '9'){
                break;
            }
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > Integer.MAX_VALUE % 10)){
                return sign == -1 ? Integer.MIN_VALUE: Integer.MAX_VALUE;
            }
            result = result * 10 + s.charAt(i) - '0';
        }


        return result * sign;
    }
}
