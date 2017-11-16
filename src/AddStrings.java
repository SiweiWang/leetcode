/**
 * Created by siweiwang on 2017-11-15.
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        String s = "";
        char [] list1 = num1.toCharArray();
        char [] list2 = num2.toCharArray();

        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        while(i >=0 || j >=0){
            int a = i>=0 ? list1[i--] - '0' : 0;
            int b = j>=0 ? list2[j--] - '0' : 0;
            int sum = a + b + carry;
            s = Character.toString((char)(sum % 10 + '0')) + s;
            carry = sum /10 ;
        }

        return carry == 1 ? "1" + s : s;
    }
}
