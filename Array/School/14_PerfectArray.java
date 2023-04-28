class Solution{
    
    public boolean IsPerfect(int a[], int n)
    {
        int start = 0;
        int end = n - 1;
        boolean flag = false;
        if(n > 1){
            while(start < end){
            
                if(a[start] == a[end]){
                    flag = true;
                }else{
                    flag = false;
                    break;
                }
                start++;
                end--;
            }
        }else{
            flag = true;
        }
        
        return flag;
    }
    
}
