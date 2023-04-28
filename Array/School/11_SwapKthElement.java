//User function Template for Java


class Solution {
    void swapKth(int arr[], int n, int k) {
     
        int temp = arr[k - 1];
        arr[k - 1] = arr[n - k];
        arr[n - k] = temp;
    }
}
