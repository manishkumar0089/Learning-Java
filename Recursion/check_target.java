package recursionArray;
import java.util.Scanner;
public class check_target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int input [] = new int [n];
        for(int i = 0;i<input.length;i++){
            input[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(find(input,target,0));
        sc.close();
    }
    public static boolean find(int [] arr, int target, int start_index){
        if(arr.length == start_index) return false;
        if(arr[start_index] == target) return true;
        return find(arr, target, start_index+1);
    }
}
