/**
 * Created by siweiwang on 2017-11-23.
 */
public class FindComplement {
    public int findComplement(int num) {
        return (1- num%2) + 2 * (num <= 1 ? 0 : findComplement(num/2));
    }
}
