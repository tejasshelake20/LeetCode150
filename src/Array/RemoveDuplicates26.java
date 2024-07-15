package Array;

public class RemoveDuplicates26 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,3};
        System.out.println(removeDuplicates(arr));
    }
    static int removeDuplicates(int[] nums){
        int a = 1;
        for(int i=1;i< nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[a] = nums[i];
                a++;
            }
        }
        return a;
    }
}
