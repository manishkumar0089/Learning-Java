package recursionArray;
import java.util.Scanner;
public class checkSorted_better {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input [] = new int [n];
        for(int i = 0;i<input.length;i++){
            input[i] = sc.nextInt();
        }
        System.out.println(checksorted(input));
        sc.close();
    }
    public static boolean checksorted(int [] arr){
        return checksorted(arr, 0);
    }
    private static boolean checksorted(int [] arr,int start){
        if(arr.length-1<=start) return true;
        
        if(arr[start] > arr[start+1]){
            return false;
        }
        return checksorted(arr, start+1);
        
    }
}
