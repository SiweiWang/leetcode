// Leet code 159

public class MajorityElement {
    public int majorityElement (int [] nums){
        int result = 0, count = 0;
        for (int num : nums){
            if (count == 0) { result = num; ++count; }
            else if (result == num) { ++count;}
            else --count;
        }
        return result;
    }

    public static void main(String[] args){
        MajorityElement m = new MajorityElement();

        int [] test = new int [] {1, 2, 1, 2, 2, 2, 2,1, 1, 1,1, 1};
        System.out.println(m.majorityElement(test));
    }
}
