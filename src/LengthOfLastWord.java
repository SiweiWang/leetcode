import java.util.Arrays;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        String [] list = s.split("\\s");
        System.out.println(Arrays.toString(list));
        return list[list.length-1].length();
    }
}
