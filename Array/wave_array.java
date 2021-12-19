class wave_array{
public static void convertToWave(int a[], int n){
        
        // Your code here
        int i=0;
        int temp=0;
        while(i<n-1)
        {
            if(i%2==0)
            {
                 temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
            i++;
        }
        
    }
    
}
