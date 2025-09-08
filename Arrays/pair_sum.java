import java.util.Scanner;

public class pair_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();
        pairSum(arr,target);
        sc.close();
    }
    public static void pairSum(int [] arr,int target){
        int start = 0;
        int end = start+1;
        int pair = 0;
        while(start<arr.length){
            if(arr[start]+ arr[end] == target) pair++;
            if(end<arr.length){
                end++;
            }
            else{
                start++;
            }
        }
        System.out.println(pair);
    }
}
