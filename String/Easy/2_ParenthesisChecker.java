class Solution
{
    //Function to check if brackets are balanced or not.
    static boolean ispar(String x)
    {
        char arr[] = x.toCharArray();
        
        int start = 0;
        int end = arr.length - 1;
	
	if(arr.length % 2 == 1) {
            
            return false;
        } else {
		
		int flag = 0;
            while(start < end) {
            	
		    if((arr[start] == (char)arr[end] - 1) || (arr[start] == (char)arr[end] - 2)) {
				    
			    flag = 1;
		    } else {
				
			    flag = 0;
			    break;
		    }
                start++;
		end--;
            }
	    for(int i = 0; i < arr.length - 1; i = i + 2) {

                if((arr[i] == (char)arr[i + 1] - 1) || (arr[i] == (char)arr[i + 1] - 2)) {
                    	
			flag = 1;
                } else {
                    
			flag = 0;
                    break;
                }
            }
	    if(flag == 1) {
		
		    return true;
	    } else {
			
		    return false;
	    }
            
        }
    }
    public static void main(String[] args) {
	String str = "[]{}()";

	boolean ret = ispar(str);
	System.out.println(ret);
    }
}
