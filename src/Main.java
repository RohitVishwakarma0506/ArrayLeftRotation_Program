class ArrayRotation
{
    public static void main(String[] args)
    {
        int arr[] = {0,1,2,3,4,5,6,7,8,9};

        int n = arr.length;
        int rotation = 5;

        for(int i=0; i<rotation; i++)
        {
            int first = arr[0];

            for(int j=0; j<n-1; j++)
            {
                arr[j] = arr[j+1];
            }
            arr[n-1] = first;
        }
        System.out.print("Left rotation Array is =");

        for(int i=0; i<n; i++)
        {
            System.out.print("  "+arr[i]);
        }
    }
}