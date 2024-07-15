package KedaneAlgorithm;

public class CircularSum {
    public static void main(String[] args) {
        int[] arr = {4,-3,15,-4,11};
        System.out.println(maxSumCircularArray(arr));
    }
    static int maxSumCircularArray(int[] nums){
        int max_so_far = Integer.MIN_VALUE;
        int max_end_here = 0;

        int n = nums.length;

        int i = 0;
        while(i <= (n * 2 - 2)){
            max_end_here += nums[i % n];

            if(max_so_far < max_end_here){
                max_so_far = max_end_here;
            }

            if(max_end_here < 0){
                max_end_here = 0;
            }

            i++;

        }
        return max_so_far;
    }
}
