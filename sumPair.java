package Hashing;
import java.util.*;
public class sumPair {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int sum=16;
        if(pairSum(arr,sum))
            System.out.println("Yaa bro");
        else
            System.out.println("Naah bro");
    }
    static boolean pairSum(int[]arr,int sum)
    {
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(h.contains(sum-arr[i]))
                return true;
            h.add(arr[i]);
        }
        return false;
    }
}
