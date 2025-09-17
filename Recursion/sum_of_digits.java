package rec_dsa1;
import java.util.Scanner;
public class sum_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
        sc.close();
    }
    public static int count(int n){
        if(n==0) return 0;
        return n%10 + count(n/10);
    }
}
