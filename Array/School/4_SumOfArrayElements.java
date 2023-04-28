//User function Template for Java


class Get
{
    public static int sumElement(int arr[], int n)
    {
        for(int i = 1; i < n; i++){
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr[n - 1];
    }
}
