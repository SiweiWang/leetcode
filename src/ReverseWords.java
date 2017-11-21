/**
 * Created by siweiwang on 2017-11-20.
 */
public class ReverseWords {
    public String reverseWords(String s) {
        String [] s_list = s.split("\\s+");
        for (int i =0; i < s_list.length; i ++){
            s_list[i] = reverse(s_list[i]);
        }

        return String.join(" ", s_list);
    }

    String reverse(String s){
        char [] list = s.toCharArray();
        int i = 0;
        int j = list.length -1;
        while(i < j){
            char temp = list[i];
            list[i] = list[j];
            list[j] = temp;
            i ++;
            j --;
        }
        return new String(list);

    }
}
