public class HouseRobber {
    public int rob(int [] nums){

        int a = 0, b = 0;
        for (int i = 0; i < nums.length; i ++){
            if( i % 2 == 0){
                a += nums[i];
                System.out.println("num[i] = " + nums[i]  + " a = " + a + " b = " + b);

                a = Math.max(a, b);
            }else {
                b += nums[i];
                System.out.println("num[i] = " + nums[i]  + " a = " + a + " b = " + b);

                b = Math.max(a, b);
            }
        }

        return Math.max(a, b);
    }

    public static void main(String[] args){
        HouseRobber h = new HouseRobber();
        h.rob(new int [] {1, 2, 100, 4,5, 6});
    }
}
