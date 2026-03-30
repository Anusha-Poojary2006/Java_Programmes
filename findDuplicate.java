//Java programme to find duplicate in array

public class findDuplicate {
    public static void main(String[] args) {
        int j;
        int arr[]={6,1,2,3,2,5,3};
        for(int i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                }
            }
           
        }
    }
}
      


