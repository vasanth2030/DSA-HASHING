package Hashing;
import java.util.*;
public class longestConsequentSequence {
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,6};
        System.out.println(longestSequence(arr));

    }
    static int longestSequence(int arr[])
    {
        int n=arr.length;
        int count=1;
        int result=1;
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            h.add(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(h.contains(arr[i]-1)) {
                count = 1;
                while (h.contains(arr[i] - count))
                    count++;
                result = Math.max(result, count);
            }
        }
        return result;
    }
}
