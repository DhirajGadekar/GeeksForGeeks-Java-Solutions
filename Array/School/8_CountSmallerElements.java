
//User function Template for Java


class Compute {
    
    public long countOfElements(long arr[], long n, long x)
    {
        long count = 0;
        for(int i = 0; i < n ;i++){
            if(x >= arr[i] ){
                count++;
            }
        }
        return count;
    }
}