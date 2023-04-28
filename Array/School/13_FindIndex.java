//User function Template for Java

class Solution
{ 
    // Function to find starting and end index 
    static int[] findIndex(int a[], int N, int key) 
    { 
        int arr[] = new int[2];
        int flag = 0;
        int itr = -1;
        for(int i = 0; i < N; i++){
            if(a[i] == key){
                flag = 1;
                itr++;
                arr[itr] = i;
                break;
            }
        }
        if(flag == 1){
            
            for(int i = N -1; i > -1; i--){
                if(a[i] == key){
                    itr++;
                    arr[itr] = i;
                    break;
                }
            }
        }else{
            arr[0] = -1;
            arr[1] = -1;
        }
        
        return arr;
    }
}
