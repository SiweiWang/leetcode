/**
 * Created by siweiwang on 2017-11-23.
 */
public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        return validPalindrome(s, false);
    }

    boolean validPalindrome(String s, boolean found){
        char[] list = s.toCharArray();
        int start = 0;
        int end = s.length() -1 ;
        while(start < end){
            if(list[start] != list[end]){
                if (found){
                    return false;
                }else{
                    return validPalindrome(s.substring(start+1, end+1), true) || validPalindrome(s.substring(start, end), true);
                }
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}
