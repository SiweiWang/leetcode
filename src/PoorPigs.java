/**
 * Created by siweiwang on 2017-11-19.
 */
public class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        double states = minutesToTest / minutesToDie + 1;
        return (int)(Math.ceil(Math.log((double)buckets)/Math.log(states)));
    }
}
