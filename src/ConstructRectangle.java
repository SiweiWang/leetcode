/**
 * Created by siweiwang on 2017-11-21.
 */
public class ConstructRectangle {
    public int[] constructRectangle(int area) {
        int r = (int)Math.sqrt(area);
        while ( area % r != 0){
            r --;
        }
        return new int[] {area/r, r};
    }
}
