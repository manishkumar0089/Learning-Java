// package Arrays.Practise;
import java.util.Scanner;
public class linear_search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {1,2,3,4,5,6};
        int m = sc.nextInt();;
        int n = -1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == m) n=i;
        }
        if(n!=-1) System.out.println(n);
        else System.out.println("Not Found");
        sc.close();
    }
}