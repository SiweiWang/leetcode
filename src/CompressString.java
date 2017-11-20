import java.util.Stack;

/**
 * Created by siweiwang on 2017-11-18.
 */
public class CompressString {
    public int compress(char[] chars) {
        if (chars.length == 0) {
            return 0;
        }
        char last = chars[0];
        int count = 0;
        int index = 0;
        for (int i = 0 ; i < chars.length; ++i){
            if (chars[i] == last ){
                count += 1;
                if (i == chars.length -1 ){
                    chars[index++] = last;
                    if (count != 1){
                        Stack<Character> s = new Stack<>();
                        while (count > 0) {
                            System.out.println(index);
                            s.push((char)(count % 10 + '0'));
                            count /= 10;
                        }
                        while(!s.empty()){
                            chars[index++] = s.pop();
                        }
                    }
                }
            }else{
                chars[index++] = last;
                if (count != 1){
                    Stack<Character> s = new Stack<>();
                    while (count > 0) {
                        System.out.println(index);
                        s.push((char)(count % 10 + '0'));
                        count /= 10;
                    }
                    while(!s.empty()){
                        chars[index++] = s.pop();
                    }
                    last = chars[i];
                    count = 1;
                }
                last = chars[i];
                if (i == chars.length -1){
                    chars[index++] = last;
                }
            }
        }
        return index;
    }

    public static void main(String [] args){
        CompressString c = new CompressString();
        char [] test = new char [] {'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        System.out.println(c.compress(test));
        System.out.println(test);
    }
}
