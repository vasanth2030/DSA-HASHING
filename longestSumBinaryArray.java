package Hashing;
import java.util.*;
public class longestSumBinaryArray {
    public static void main(String[] args) {
        int arr1[]={1,1,1,0,0,0,0,1,0};
        int arr2[]={1,0,0,0,1,1,0,0,1};
        System.out.println(longestSubArray(arr1,arr2));
    }
    static int longestSubArray(int arr1[],int arr2[])
    {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int n=arr1.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[i]=arr1[i]-arr2[i];
        }
        int presum=0;
        int length=0;
        for(int i=0;i<n;i++)
        {
            presum+=temp[i];
            if(presum==0)
                length=i+1;
            if(!h.containsKey(temp[i]))
                h.put(temp[i],i);
            if(h.containsKey(presum))
                length=Math.max(length,i-h.get(presum));

        }
        return length;
    }
}
