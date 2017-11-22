/**
 * Created by siweiwang on 2017-11-21.
 */
public class ConvertToBase7 {
    public String convertToBase7(int num) {
        boolean neg = false;
        if (num < 0 ){
            num = -num;
            neg = true;
        }
        if (num == 0){
            return "0";
        }
        String res = "";
        while (num > 0){
            res = String.valueOf( num % 7 )  + res ;
            num = num /7;
        }
        return neg? "-" + res: res;
    }
}
