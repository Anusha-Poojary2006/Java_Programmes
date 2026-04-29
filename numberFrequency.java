//Java program to get frequency of elements in array

import java.util.HashMap;
import java.util.*;
import java.util.Map.Entry;
public class numberFrequency {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,3,3,4,4,5,5,5,5};
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int element:arr){
            map.put(element,map.getOrDefault(element,0)+1);
        }
        Set<Entry<Integer,Integer>> entryset=map.entrySet();
        for(Entry<Integer,Integer> entry:entryset){
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
