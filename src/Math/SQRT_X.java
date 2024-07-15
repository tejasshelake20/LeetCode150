package Math;

public class SQRT_X {
    public static void main(String[] args) {
        int num = 8;
        System.out.println(squareRoot(num));
    }
    static int squareRoot(int num){
        long ans = 0;
        long start = 0;
        long end = num;
        while(start <= end){
            long mid = start + (end - start) / 2;

            if(mid * mid == num){
                ans = (int)mid;
                break;
            }
            else if(mid * mid < num){
                start = mid + 1;
                ans = (int)mid;
            }
            else{
                end = mid - 1;
            }
        }
        return (int)ans;
    }
}
