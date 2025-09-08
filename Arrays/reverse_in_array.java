// package Arrays.Practise;
import java.util.Scanner;
public class reverse_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int first=0,last=arr.length-1;
        while(first<last){
            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
