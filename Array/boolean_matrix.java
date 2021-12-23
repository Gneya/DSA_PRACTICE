class boolean_matrix
{
    //Function to modify the matrix such that if a matrix cell matrix[i][j]
    //is 1 then all the cells in its ith row and jth column will become 1.
    void booleanMatrix(int matrix[][])
    {
        // code here 
        int temp[][]=new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==1)
                {
                    for(int x=0;x<matrix[i].length;x++)
                    {
                        temp[i][x]=1;
                    }
                    for(int y=0;y<matrix.length;y++)
                    {
                        temp[y][j]=1;
                    }
                }
            }
        }
    System.arraycopy(temp, 0, matrix, 0, temp.length);
    }
}
