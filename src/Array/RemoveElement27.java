package Array;
import java.util.Arrays;

public class RemoveElement27 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};

        removeElement(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    static void removeElement(int[] nums, int val) {
        int a = 0;
        for(int i=0;i< nums.length;i++){
            if(nums[i] != val){
                nums[a++] = nums[i];
            }
        }
    }
}
