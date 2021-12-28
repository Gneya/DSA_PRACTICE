class selection_sort
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
     
        return arr[i];
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    int pos;
	    for(int i=0;i<n;i++)
	    {
	        int min=i;
	         for(int j=i+1;j<arr.length;j++)
        {
            if(arr[j]<arr[min])
            {
                int temp=arr[min];
	        arr[min]=arr[j];
	        arr[j]=temp;
            }
        }
	        select(arr,i);
	        
	    }
	}
}
