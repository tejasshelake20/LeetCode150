package Math;

public class ValidPalindromeNum {
    public static void main(String[] args) {
        int num = 234432;
        System.out.println(isPalindromeNum(num));
    }

    static boolean isPalindromeNum(int num){
        int temp = num;
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev == temp;
    }

}
