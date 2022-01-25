class Solution {
    public static boolean isSafe(int x,int y,int n,int m[][],int visited[][])
    {
        if((x>=0 && x<n) && (y>=0 && y<n) && (visited[x][y]==0) && (m[x][y]==1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void solve(int[][] m, int n,int x,int y,ArrayList<String> ans,int[][] visited,StringBuilder path)
    {
        //System.out.println(x+" "+y);
     if(x==n-1 && y==n-1)
     {
         ans.add(path.toString());
         return;
     }
     
     visited[x][y]=1;
     
     int newx=x+1;
     int newy=y;
     if(isSafe(newx,newy,n,m,visited))
     {
         path.append("D");
         solve(m,n,newx,newy,ans,visited,path);
         path.deleteCharAt(path.length()-1);
     }
     
     newx=x-1;
     newy=y;
     if(isSafe(newx,newy,n,m,visited))
     {
          path.append("U");
        solve(m,n,x-1,y,ans,visited,path);
        path.deleteCharAt(path.length()-1);
     }
    
    newx=x;
    newy=y+1;
    if(isSafe(newx,newy,n,m,visited))
     {
          path.append("R");
       solve(m,n,x,y+1,ans,visited,path);
       path.deleteCharAt(path.length()-1);
     }
     
     newx=x;
    newy=y-1;
    if(isSafe(newx,newy,n,m,visited))
     {
          path.append("L");
       solve(m,n,x,y-1,ans,visited,path);
       path.deleteCharAt(path.length()-1);
     }

     
     
     visited[x][y]=0;
     
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> ans=new ArrayList<String>();
        int x=0;
        int y=0;
        if(m[0][0]==0)
        {
            return ans;
        }
        StringBuilder path=new StringBuilder();
        int[][] visited=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                visited[i][j]=0;
            }
        }
        
        solve(m,n,x,y,ans,visited,path);
        Collections.sort(ans);
        
        return ans;
    }
}
