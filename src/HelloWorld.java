import java.util.*;
public class HelloWorld {

    public static void main(String[] args) {
        // Prints "Hello, World" to the terminal window.
        System.out.println("Hello, World");
        List<String> ans = new ArrayList<String>() ;
        int n =20;
        for (int i = 1; i <= n; i ++) {
            boolean mod_by_3 = (i % 3 == 0);
            boolean mod_by_5 = (i % 5 == 0);

            if (mod_by_3 && mod_by_5) {
                ans.add("FizzBuzz");
            }else if (mod_by_3) {
                ans.add("Fizz");
            }else if (mod_by_5) {
                ans.add("Buzz");
            }else {
                ans.add(Integer.toString(i));
            }
        }
        System.out.println(ans);
    }

}