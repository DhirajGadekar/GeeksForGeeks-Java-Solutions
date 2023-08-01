/* *
 * Program 1 : Sort an array of 0s, 1s and 2s 
 */

class Solution
{
    public static void sort012(int a[], int n)
    {
        int zero = 0, one = 0, two = 0;
        for(int i = 0; i < a.length; i++) {
            
            if(0 == a[i]) {
                
                zero++;
            }else if(1 == a[i]) {
                
                one++;
            } else {
                
                two++;
            }
        }
        int i = 0;
        if(zero != 0) {
            for(i = 0; i < zero; i++) {
                a[i] = 0;
            }
        }
        if(one != 0) {
            
            for(int j = 0; j < one; j++) {
                
                a[i] = 1;
                i++;
            }
        }
        if(two != 0) {
            for(int j = 0; j < two; j++) {
                
                a[i] = 2;
                i++;
            }
        }
    }
}
