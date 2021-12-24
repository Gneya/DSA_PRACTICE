class search_in_matrix 
{ 
    //Function to search a given number in row-column sorted matrix.
	static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    for(int i=0;i<n;i++)
	    {
	        if(x>=matrix[i][0] && x<=matrix[i][m-1])
	        {
	            int left=0;
	            int right=m-1;
	            int mid;
	            while(left<=right){
	            mid=(left+right)/2;
	            if(matrix[i][mid]==x)
	            {
	                return true;
	            }
	            else if(matrix[i][mid]<x)
	            {
	                left=mid+1;
	            }
	            else
	            {
	                right=mid-1;
	            }
	            }
	        }
	    }
	    return false;
	} 
} 
