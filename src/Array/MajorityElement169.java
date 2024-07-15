package Array;

// 169. https://leetcode.com/problems/majority-element/description/
// Moore's Voting Algorithm --> TC: O(N) & SC: O(1)

public class MajorityElement169 {

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
//    static int majorityElement(int[] nums) {
//        int count = 0;
//        int element = 0;
//
//        for(int i = 0;i<nums.length;i++){
//            if(count  == 0){
//                count = 1;
//                element = nums[i];
//            }
//            else if(element == nums[i]){
//                count++;
//            }
//            // (element != nums[i])
//            else{
//                count--;
//            }
//        }
//        return element;
//    }

    static int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;

        for(int i = 0;i<nums.length;i++){
            if(count  == 0){
                count = 1;
                element = nums[i];
            }
            else if(element == nums[i]){
                count++;
            }
            // (element != nums[i])
            else{
                count--;
            }
        }

        // Case - if no element occurs more than n/2 times
        int count1 = 0;
        for(int i=0;i< nums.length;i++){
            if(nums[i] == element){
                count1++;
            }
        }
        if(count1 > nums.length/2){
            return element;
        }
        return -1;
    }

}
