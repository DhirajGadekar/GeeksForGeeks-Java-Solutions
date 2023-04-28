//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        
        int min = arr[0];
        int diff = 0;
        for(int i = 1; i < n; i++){
            
            if(min > arr[i]){
                min = arr[i];
            }
            diff = arr[i -1] - arr[i];
        }
        int first = min;
        int sec = min;
        if(diff != 0){
            
            for(int i = 0; i < n; i++){
            
                if(first < arr[i]){
                
                    sec = first;
                    first = arr[i];
                }else if(sec < arr[i] && first != arr[i]){
                
                    sec = arr[i];
                }
            }
        }else {
            sec = -1;
        }
        return sec;
    }
}
