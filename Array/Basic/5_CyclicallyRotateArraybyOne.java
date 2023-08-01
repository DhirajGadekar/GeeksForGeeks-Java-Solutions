
/* *
 * Program  5 : Cyclically rotate an array by one
 */

//User function Template for Java

class Compute {
    
    public void rotate(int arr[], int n)
    {
        int temp = arr[n - 1];
        for(int i = n - 1; i > 0; i--) {
            
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
}
