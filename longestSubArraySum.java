package Hashing;
import java.util.*;
public class longestSubArraySum {
    public static void main(String[] args) {
        int arr[]={6,6,7,8,1,2,3,4,5};
        int sum=15;
        System.out.println(longestSubarray(arr,sum));

    }
    static int longestSubarray(int arr[],int sum)
    {
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        int presum=0;
        int length=0;
        for(int i=0;i<arr.length;i++)
        {
            presum+=arr[i];
            if(presum==sum)
                length=i+1;
            if(!h.containsKey(presum))
                h.put(presum,i);
            if(h.containsKey(presum-sum))
                length=Math.max(length,i-h.get(presum-sum));

        }
        return length;
    }
}
