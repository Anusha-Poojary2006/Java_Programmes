//Java programme to find sum of two number in the array is equal to target number

import java.util.Arrays;
import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length;i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}
public class TwoSum{
    public static void main(String[] args) {
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++){
        nums[i]=sc.nextInt();}
        System.out.println("Enter the target:");
        int target=sc.nextInt();
        System.out.println("Output:");
        int[] result=s.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
