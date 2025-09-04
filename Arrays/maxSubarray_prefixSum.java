// package Arrays.Practise;
import java.util.*;
public class maxSubarray_prefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = subarraySum(arr);
        System.out.println(m);
        sc.close();
    }
    public static int subarraySum(int [] arr){
        int maxSum = 0;
        int [] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i= 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int curr= i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                maxSum = Math.max(maxSum, curr);
            }
        }
        return maxSum;
    }
}
