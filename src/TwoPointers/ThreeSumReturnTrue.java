package TwoPointers;

import java.util.Arrays;

public class ThreeSumReturnTrue {
    public static void main(String[] args) {
        int[] arr = {2,4,-1,3,-4,0,3};
        System.out.println(threeSumBoolean(arr));
    }

    static boolean threeSumBoolean(int[] arr){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 2; i++){
            if(twoSumFor3SumBoolean(arr, -arr[i], i + 1)){
                return true;
            }
        }
        return false;
    }

    static boolean twoSumFor3SumBoolean(int[] arr, int target, int i){
        int j = arr.length - 1;
        while(i < j){
            if(arr[i] + arr[j] > target){
                j--;
            }
            else if(arr[i] + arr[j] < target){
                i++;
            }
            else{
                return true;
            }
        }
        return false;
    }


}
