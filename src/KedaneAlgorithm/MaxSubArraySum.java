package KedaneAlgorithm;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {5,-3,5};
        System.out.println(max_sub_array_sum(arr));
    }
    static int max_sub_array_sum(int[] num){
        int max_so_far = Integer.MIN_VALUE;
        int max_end_here = 0;

        for(int i = 0; i < num.length; i++){
            max_end_here = max_end_here + num[i];

            max_so_far = Math.max(max_end_here,max_so_far);

            if(max_end_here < 0){
                max_end_here = 0;
            }
        }
        return max_so_far;
    }
}
