
/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n){
	    int flag = 0;
        for(int i =0;i < n; i++){
            int sum = 0;
            int num = a[i];
            while(num != 0){
                sum = (sum * 10) + (num % 10);
                num /= 10;
            }
            if(sum == a[i]){
                flag = 1;
            }else{
                flag = 0;
            }
            if(flag == 0){
                break;
            }
        }
        return flag;
   }
}
