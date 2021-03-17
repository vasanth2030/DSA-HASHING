package Hashing;
import java.util.*;
public class frequencyOfNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter array to find unique elements");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println("Number of unique elements in the list");
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            hs.add(arr[i]);
        }
        System.out.println(hs.size());
        Iterator<Integer> it=hs.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+ " ");
        }
        System.out.println();
        System.out.println("Enter array to find frequency of elements");
        int m=s.nextInt();
        int[] arr1=new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i]=s.nextInt();
        }
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<m;i++)
        {
            if(hm.containsKey(arr[i]))
                hm.put(arr[i],hm.get(arr[i])+1);
            else
                hm.put(arr[i],1);
        }
        Set set=hm.entrySet();
        Iterator itt=set.iterator();
        while(itt.hasNext()) {
            Map.Entry map= (Map.Entry)itt.next();
            System.out.println(map.getKey() + " " + map.getValue());
        }

    }
}
