/**
 * Created by siweiwang on 2017-11-13.
 */
public class GuessNumber {
    public int guessNumber(int n) {
        if (guess(n) == 0) return n;
        int start = 1;
        int last = n;
        while (start < last ){
            int mid = start + (last - start) /2;
            int t = guess(mid);
            if (t ==0 ){
                return mid;
            }else  if (t ==1 ) {
                start = mid;
            } else {
                last = mid;
            }
        }
        return start;
    }

    public int guess(int n){
        return -1;
    }
}
