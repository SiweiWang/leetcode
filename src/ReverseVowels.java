/**
 * Created by siweiwang on 2017-11-13.
 */
public class ReverseVowels {
    public String reverseVowels(String s){
        char [] list = s.toCharArray();
        int left = 0;
        int right = s.length() -1;
        while (left < right){
            if (isVowels(list[left]) && isVowels(list[right])){
                char temp = list[left];
                list[left++] = list[right];
                list[right--] = temp;

            } else if (isVowels(list[left])){
                right --;
            } else {
                left ++;
            }
        }
        return new String(list);
    }


    boolean isVowels(char a){
        return a == 'a' || a == 'A' || a == 'e' || a == 'E' || a =='i' || a == 'I' || a == 'o' || a =='O' || a == 'y' || a == 'Y';
    }
}
