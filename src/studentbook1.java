import com.sun.org.apache.xpath.internal.functions.FuncFalse;

/**
 * Created by siweiwang on 2017-10-16.
 */
public class studentbook1 {
    public boolean checkRecord(String s) {
        return !s.contains("LLL") && s.indexOf("A") == s.lastIndexOf("A");
    }

    public static void main(String[] args){
        studentbook1 s = new studentbook1();
        System.out.println(s.checkRecord("ALLAPPL"));
    }
}
