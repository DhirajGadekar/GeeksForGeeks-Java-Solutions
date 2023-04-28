// User function Template for Java

class Solution {
    int sum(int arr[], int n) {
        
        for(int i = 1; i < n; i++){
            
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr[n - 1];
    }
}
