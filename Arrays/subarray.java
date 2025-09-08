// package Arrays.Practise;
import java.util.Scanner;
public class subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        subarrayy(arr);
        sc.close();
    }
    static void subarrayy(int [] arr){
        for(int i= 0;i<arr.length;i++){
            for(int j = i;j<arr.length;j++){
                for(int k = i; k<j+1;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
