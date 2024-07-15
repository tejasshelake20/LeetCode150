package Intervals;

import java.util.List;
import java.util.ArrayList;

// 268 - https://leetcode.com/problems/summary-ranges/
public class SummaryRanges {
    public static void main(String[] args) {
        int[] arr = {4};
        List<String> ranges = summaryRanges(arr);

        System.out.println(ranges);

    }
    static List<String> summaryRanges(int[] nums){
        StringBuilder s = new StringBuilder("");
        List<String> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i < nums.length-1 && nums[i] == nums[i+1]-1){
                s.append("\"").append(nums[i]).append("->");
                while(i < nums.length-1 && nums[i] == nums[i+1]-1){
                    i++;
                }
                s.append(nums[i]).append("\"");
                list.add(s.toString());
                s.setLength(0);
            }else{
                list.add("\""+ nums[i]+"\"");
            }
        }
        return list;
    }
}
