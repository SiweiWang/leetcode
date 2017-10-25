public class DetectCapitalUse {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 1) { return true ; }
        char [] list = word.toCharArray();
        boolean firstSmall = list[0] > 'Z';
        boolean secondSmall = list[1] > 'Z';

        for (int i = 2; i < list.length; i ++){
            boolean current = list[i] > 'Z';
            if (secondSmall ^ current){
                return false;
            }
        }

        if ((secondSmall) || (!firstSmall && !secondSmall)){
            return true;
        }
        return false;
    }

    public static void main (String[] args){
        DetectCapitalUse d = new DetectCapitalUse();
        System.out.println(d.detectCapitalUse("Flag"));
        System.out.println(d.detectCapitalUse("GOGOGLE"));
        System.out.println(d.detectCapitalUse("adc"));
        System.out.println(d.detectCapitalUse("dFERT"));
        System.out.println(d.detectCapitalUse("dEErrr"));
    }
}
