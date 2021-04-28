package Hashing;
import java.util.*;
public class IntersectionOfArrays {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5,6,7,8};
        int arr2[]={1,3,5,6,7,5,3};
        System.out.println(Intersection(arr1,arr2));

    }
    static int Intersection(int arr1[],int arr2[])
    {
        HashSet<Integer> h=new HashSet<Integer>();
        for(int i=0;i<arr1.length;i++)
        {
            h.add(arr1[i]);
        }
        int count=0;
        for(int i=0;i<arr2.length;i++)
        {
            if(h.contains(arr2[i])) {
                count++;
                h.remove(arr2[i]);
            }
        }
        return count;
    }
}
