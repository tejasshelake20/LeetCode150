package TwoPointers;

public class ValidPalindromeString {
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        String str = s.toLowerCase();
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        int i = str.charAt(0);
        int j = str.charAt(str.length() - 1);

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
