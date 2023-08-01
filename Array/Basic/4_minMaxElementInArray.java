//Program 4 : Find minimum and maximum element in an array  

//User function Template for Java

/*
 class Pair  
{  
    long first, second;  
    public Pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} */

class Compute 
{
    static Pair getMinMax(long a[], long n)  
    {
        long max = a[0];
        long min = a[0];
        
        for(int i = 0; i < n; i++) {
            
            if(a[i] > max) {
                
                max = a[i];
            }
            if(a[i] < min) {
                
                min = a[i];
            }
        }
        
        return new Pair(min, max);
    }
}
