import java.util.ArrayList;

public class reverse_array
{
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int start=m+1;
        int end=arr.size()-1;
        while(start<=end)
        {
            int temp=arr.get(start);
            arr.set(start,arr.get(end));
            arr.set(end,temp);
            start++;
            end--;
        }
    }
}
