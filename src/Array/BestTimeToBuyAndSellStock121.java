package Array;

public class BestTimeToBuyAndSellStock121 {
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    static int maxProfit(int[] arr){
        int profit = 0;
        int buyingStart = arr[0];
        for(int i=1; i< arr.length;i++){
            if(arr[i] < buyingStart){
                buyingStart = arr[i];
            }
            else if(arr[i] - buyingStart > profit){
                profit = arr[i] - buyingStart;
            }
        }
        return profit;
    }
}
