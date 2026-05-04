//A simple java program for minimum frequency number in array

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class MinNumFrequency {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,3,3,4,4,5,5,5,5};
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int element:arr){
            map.put(element,map.getOrDefault(element,0)+1);
        }
        Set<Entry<Integer,Integer>> entryset=map.entrySet();
        System.out.println("Minimum frequency number:");
        int minFreq=Integer.MAX_VALUE;
        int min=0;
        for(Entry<Integer,Integer> entry:entryset){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value < minFreq){
               minFreq=value;
               min=key;
            }
        }
        System.out.println(min);
    }
}
