//A simple java program for Maximum frequency number in array

import java.util.Map.Entry;
import java.util.*;

public class MaxNumFrequency {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,3,3,4,4,5,5,5,5,6};
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int element:arr){
            map.put(element,map.getOrDefault(element,0)+1);
        }
        Set<Entry<Integer,Integer>> entryset=map.entrySet();
        System.out.println("Maximum frequency numbers:");
        int maxFreq=Integer.MIN_VALUE;
        int max=0;
        for(Entry<Integer,Integer> entry:entryset){
            int key=entry.getKey();
            int value=entry.getValue();
            if(value>maxFreq){
                maxFreq=value;
                max=key;
            }
        }
        System.out.print(max);
    }
}
