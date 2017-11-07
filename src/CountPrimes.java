/**
 * https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 */
public class CountPrimes {
    public int countPrimes(int n) {
        if (n == 0 || n == 1 || n == 2){
            return 0;
        }
        boolean [] nums = new boolean[n-1];
        int result = 0;
        for (int i = 0; i < nums.length; i ++){
            nums[i] = true;
        }

        nums[0] = false;

        double limit =  Math.ceil(Math.sqrt(n));
        for (int i = 2; i <= limit; ++i){
            if(nums[i-1]){
                for (int j = i*i; j < n; j += i) {
                    nums[j-1] = false;
                }
            }
        }

        for (boolean elem : nums){
            if (elem){
                result++;
            }
        }
        return result;
    }

    public static void main(String [] args){
        CountPrimes c = new CountPrimes();
        System.out.print(c.countPrimes(2));
    }
}
