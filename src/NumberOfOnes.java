public class NumberOfOnes {
    public int numberOPOnes(int n){
        int result = 0;
        for (int i = 0; i < 32; i ++){
            if ( (n & 1) == 1) { result++; }
            n = n >> 1;
        }

        return result;
    }
}
