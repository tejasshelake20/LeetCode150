package TwoPointers;

public class IsSubSequence {
    public static void main(String[] args) {
        String s = "b", t = "abc";
        System.out.println(isSubsequence(s,t));
    }
    static boolean isSubsequence(String s, String t) {
        if(s.isEmpty()){
            return true;
        }
        int j = 0;
        int i = 0;
        while(i<t.length()){
            if(t.charAt(i) == s.charAt(j)){
                j++;
                if(j == s.length()){
                    return true;
                }
            }
            i++;
        }
        return false;
    }
}
