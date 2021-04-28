package Hashing;
import java.util.*;
public class distinctElementsInWindow {
    public static void main(String[] args) {
        int arr[]={1,2,2,1,3,4,5,7,5};
        int k=4;
        distinctElements(arr,4);
    }
    static void distinctElements(int arr[],int k)
    {
        int n=arr.length;
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        for(int i=0;i<k;i++)
        {
            if(h.containsKey(arr[i]))
                h.replace(arr[i],h.get(arr[i]),h.get(arr[i])+1);
            else
                h.put(arr[i],1);
        }
        System.out.print(h.size()+" ");
        for(int i=k;i<n;i++)
        {
            h.replace(arr[i-k],h.get(arr[i-k]),h.get(arr[i-k])-1);
            if(h.get(arr[i-k])==0)
                h.remove(arr[i-k]);
            if(h.containsKey(arr[i]))
                h.replace(arr[i],h.get(arr[i]),h.get(arr[i])+1);
            else
                h.put(arr[i],1);
            System.out.print(h.size()+" ");
        }
    }
}
