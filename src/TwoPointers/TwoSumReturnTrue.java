package TwoPointers;

import java.util.Arrays;

public class TwoSumReturnTrue {
    public static void main(String[] args) {
        int[] arr = {3,2,7};
        System.out.println(twoSumBoolean(arr,19));;
    }
    static boolean twoSumBoolean(int[] arr, int target){
        Arrays.sort(arr);
        int i = 0, j = arr.length - 1;
        while(i < j){
            if(arr[i] + arr[j] < target){
                i++;
            }
            else if(arr[i] + arr[j] > target){
                j--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
