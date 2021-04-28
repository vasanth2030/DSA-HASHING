package Hashing;
import java.util.*;
public class UninonOfArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8};
        int arr2[]={1,3,5,6,7,5,3,9};
        System.out.println(UnionArray(arr1,arr2));
    }
    static int UnionArray(int[]arr1, int arr2[])
    {
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++)
        {
            h.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++)
        {
            h.add(arr2[i]);
        }
        return h.size();
    }
}
