/**
 * Created by siweiwang on 2017-11-08.
 */
public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        int [] s_list = new int [256];
        int [] t_list = new int [256];
        for (int i =0; i < s.length(); i ++){
            if (s_list[(int)(s.charAt(i))] != t_list[(int)(t.charAt(i))]){
                return false;
            }else{
                s_list[(int)(s.charAt(i))] = i + 1;
                t_list[(int)(t.charAt(i))] = i + 1;
            }
        }
        return true;
    }
}
