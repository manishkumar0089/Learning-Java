import java.util.Scanner;
public class binary_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter No. to find");
        int target = sc.nextInt();
        System.out.println(binary(arr, target));
        sc.close();
    }
    public static int binary(int [] arr, int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target) return mid ;
            else if(arr[mid]>target) end = mid-1;
            else start=mid+1;
        }
        return -1;
    }
}
