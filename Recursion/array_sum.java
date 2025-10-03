package recursionArray;
import java.util.Scanner;
public class array_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input [] = new int [n];
        for(int i = 0;i<input.length;i++){
            input[i] = sc.nextInt();
        }
        System.out.println(arr_sum(input,0));
        sc.close();
    }
    public static int arr_sum(int [] arr,int start_index){
        if(arr.length == start_index) return 0;
        return arr[start_index] + arr_sum(arr, start_index+1);
    }
}
