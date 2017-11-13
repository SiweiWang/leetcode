public class ReverseBit {
    public int reverseBit (int n){
        int result = 0;
        for ( int i = 0; i < 32; i ++){
            if ( (n & 1) == 1){
                result = (result << 1) + 1;
            }else{
                result = (result << 1);
            }

            n = n >> 1;
        }

        return result;
    }

    public static void main (String[] args){
        ReverseBit r = new ReverseBit();
        System.out.println(r.reverseBit(43261596));
    }
}
