public class NumberOfLocks {
    public boolean [] numbeOfLocks(int count){
        boolean [] locks = new boolean [count];
        for (int i = 0; i < locks.length; i ++){
            // true means locked
            locks[i] = true;
        }
        for (int i = 1; i <= count; i ++){
            for (int j =1 ; j <= locks.length; j ++){
                if (j % i ==0){
                    locks[j-1] = !locks[j-1];
                }
            }
        }
        return locks;
    }

    public static void main(String[] args){
        NumberOfLocks n = new NumberOfLocks();
        boolean [] s  = n.numbeOfLocks(100);
        int count = 0;
        for (int i = 0; i < s.length; i ++){
            if (s[i]){
                count ++;
                System.out.println(i+1);
            }
        }

        System.out.println("Total: " + count);
    }
}
