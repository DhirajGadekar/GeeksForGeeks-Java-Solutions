//User function Template for Java

class Solution {
    
    public long getSum(long a[], long n)
    {
        long sum = 0;
        for(int i = 0; i < n; i++){
            
            sum = sum + a[i];
        }
        return sum;
    }
}
