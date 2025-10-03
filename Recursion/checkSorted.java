package recursionArray;
import java.util.Scanner;
public class checkSorted {
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
    public static boolean checksorted(int input []){
        if(input.length <= 1){
            return true;
        }

        int smallInput[] = new int[input.length - 1];
        for(int i = 1;i<input.length;i++){
            smallInput[i-1] = input[i];
        }
        boolean smallAns = checksorted(smallInput);
        if(!smallAns){
            return false;
        }
        if(input[0]<=input[1]){
            return true;
        }
        else return false;
    }
    public static boolean checksorted_2(int input [] ){
        if(input.length <= 1){
            return true;
        }
        if(input[0] > input[1]){
            return false;
        }
        int smallInput[] = new int[input.length - 1];
        for(int i = 1;i<input.length;i++){
            smallInput[i-1] = input[i];
        }
        return checksorted_2(smallInput);
    }
}
