/* *
 * Program 2 : Move all negative elements to end
 */

//User function Template for Java

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        int nums[] = new int[n];
        int j = n - 1;
        int itr1 = 0;
        int itr2 = n - 1;
        for(int i = 0; i < n; i++) {
            
            if(arr[i] > 0) {
                
                nums[itr1] = arr[i];
                itr1++;
            }
            if(arr[j] < 0) {
                nums[itr2] = arr[j];
                itr2--;
            }
            j--;
        }
    
        for(int i = 0; i < n; i++) {
            
            arr[i] = nums[i];
        }
    }
}
