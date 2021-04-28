package Hashing;
import java.util.*;
public class subArraySum {
    public static void main(String[] args) {
        int arr[]={2,2,3,4,5,6,8,8,9};
        int sum=15;
        if(subArraysum(arr,sum))
            System.out.println("Yess broo");
        else
            System.out.println("No brooo");


    }
    static boolean subArraysum(int arr[],int sum)
    {
        int presum=0;
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            presum+=arr[i];
            if(presum==sum)
                return true;
            if(h.contains(presum-sum))
                return true;
            h.add(presum);
        }
        return false;
    }
}
