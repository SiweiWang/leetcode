/**
 * Created by siweiwang on 2017-11-21.
 */
public class ConstructRectangle {
    public int[] constructRectangle(int area) {
        int r = (int)Math.sqrt(area);
        while ( area % r != 0){
            r --;
        }
        String s = "abc";
        System.out.println(s.substring(1,2));
        return new int[] {area/r, r};
    }
}
