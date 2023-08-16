//Subarray with given sum

import java.util.*;

class Solution {
    
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        
        int start = 0;
        int end = -1;
        int sum = 0;
        if(s == 0) {
            
            al.add(-1);
            return al;
        }
        for(int i = 0; i < arr.length; i++) {
            
            end++;
            sum = sum + arr[end];
            
            while(sum > s) {
    
                sum = sum - arr[start];
                start++;
            }
            if(sum == s) {
                
                break;
            }
        }
        if(sum == s) {
            
            al.add(start + 1);
            al.add(end + 1);
        } else {
            
            al.add(-1);
        }
        return al;
    }
}
