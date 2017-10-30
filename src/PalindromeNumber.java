public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // slow
//        if (x > 0 && x < 10 ) { return true ;}
//        if (x < 0) { return false; }
//        int div = 10;
//        while (x / div >= 10) {
//            div *= 10;
//        }
//        while (x > 0) {
//            System.out.println(div);
//
//            System.out.println(x/div);
//            System.out.println(x%10);
//
//            if (x/div != x % 10) {
//                System.out.println(div);
//                return false;
//            }
//            x = x % div / 10;
//            div /= 100;
//        }
//        return true;
        if ( x < 0 || x ==10 ){
            return false;
        }

        int reverse = 0;
        int y = x;
        while (y > 0){
            reverse = reverse * 10 + y % 10;
            y = y/10;
        }

        System.out.println(reverse);
        if (x == reverse) { return true;}
        return false;
    }

    public static void main (String[] args){
        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(121));
    }
}
