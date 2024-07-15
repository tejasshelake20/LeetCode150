package TwoPointers;

import java.util.Arrays;

public class TwoSumReturnArr {
    public static void main(String[] args) {
        int[] arr = {2,13,14,15};
        System.out.println(Arrays.toString(twoSumArr(arr,9)));
    }

    static int[] twoSumArr(int[] numbers, int target) {

        int i=0, j = numbers.length-1;
        int[] ans = new int[2];
        while(i<j){

            if(numbers[i] + numbers[j] > target){
                j--;
            }
            else if(numbers[i] + numbers[j] < target){
                i++;
            }
            else{
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
        }
        return new int[0];
    }
}
