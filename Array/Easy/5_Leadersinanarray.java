//Leaders in an array

import java.util.*;

class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> al = new ArrayList<Integer>();

        int max = arr[n - 1];
        al.add(arr[n - 1]);
        for(int i = n - 2; i >= 0; i--) {

            if(max <= arr[i]) {

                max = arr[i];
                al.add(0 , arr[i]);
            }
        }
        return al;
    }
}
