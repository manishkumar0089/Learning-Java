// package Arrays.Practise;
import java.util.*;
public class max_subarraybf {
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
        for(int i= 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                int curr= 0;
                for(int k = i; k<j+1;k++){
                    curr+=arr[k];
                }
                maxSum = Math.max(maxSum, curr);
            }
        }
        return maxSum;
    }
}
