package Array;

public class RomanToInteger {

    public static void main(String[] args) {
        String str = "LXIV";
        System.out.println(romanToInt(str));
    }

    static int romanToInt(String str) {

        int add = 0;
        int finalNum = 0;
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'I'){
                add = 1;
            }
            else if(ch == 'V'){
                add = 5;
            }
            else if(ch == 'X'){
                add = 10;
            }
            else if(ch == 'L'){
                add = 50;
            }
            else if(ch == 'C'){
                add = 100;
            }
            else if(ch == 'D'){
                add = 500;
            }
            else{
                add = 1000;
            }

            finalNum = finalNum + add;

        }

        for(int i = 1; i < str.length(); i++) {
            int i1 = str.charAt(i) + str.charAt(i - 1);
            if(str.charAt(i) == 'I' && (i1 == 140 || i1 == 141 || i1 == 149 || i1 == 150 || i1 == 159 || i1 == 161)){
                finalNum = finalNum - 2;
            }
        }

        return finalNum;
    }
}
