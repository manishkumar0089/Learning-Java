import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        selectionSort(arr,n);
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
    public static void selectionSort(int [] arr,int n){
        for(int i = 0;i<n-1;i++){
            int minpos = i;
            for(int j = i+1;j<n;j++){
                if(arr[minpos] > arr[j]){
                    minpos = j;
                }
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }
}
