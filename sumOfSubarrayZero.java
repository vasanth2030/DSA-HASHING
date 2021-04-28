package Hashing;
import java.util.*;
public class sumOfSubarrayZero {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,-18};
        if(subArrayZero(arr))
            System.out.println("Yaaaaa brooo");
        else
            System.out.println("Noooo brooo");
    }
    static boolean subArrayZero(int arr[])
    {
        HashSet<Integer> h=new HashSet<Integer>();
        int presum=0;
        //Calculate presum. If presum is repeated or is 0 return true
        for(int i=0;i<arr.length;i++)
        {
            presum+=arr[i];
            if(h.contains(presum))
                return true;
            if(presum==0)
                return true;
            h.add(presum);
        }
        return false;
    }
}
