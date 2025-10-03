package recursionArray;
import java.util.Scanner;
public class all_indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input [] = new int [n];
        for(int i = 0;i<input.length;i++){
            input[i] = sc.nextInt();
        }
        System.out.println("Enter target");
        int target = sc.nextInt();
        int [] output = check(input,target,0);
        if(output.length>0){for(int i = 0;i<output.length;i++){
            System.out.print(output[i] + " ");
        }}
        else{
            System.out.println(-1);
        }
        sc.close();
    }
    public static int[] check(int [] arr,int target,int start){
        if(start==arr.length){
            int output[] = new int[0];
            return output;
        }
        int small[] = check(arr, target, start+1);
        if(arr[start] == target){
            int output[] = new int[small.length+1];
            output[0] = start;
            for(int i = 0;i<small.length;i++){
                output[i+1] = small[i];
            }
            return output;
        }
        else return small;
    }
}
