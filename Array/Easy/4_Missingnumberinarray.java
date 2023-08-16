//Missing number in array : 

import java.util.*;

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        Arrays.sort(array);
        if(array.length == 1) {
            
            if(array[0] == 1) {
                
                return 2;
            } else {
                
                return 1;
            }
        }
        if(array[0] == 2) {
                
            return 1;    
        }
        for(int i = 0; i < array.length - 1; i++) {

            if((array[i + 1] - array[i]) != 1) {

                return (array[i] + 1);
            }
        }
        return (array[array.length - 1] + 1);
    }
}
