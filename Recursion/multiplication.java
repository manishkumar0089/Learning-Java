package rec_dsa1;
import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(multiply(m,n));
        sc.close();
    }
    public static int multiply(int m ,int n){
        if(n == 0 || m==0) return 0;
        int small = m + multiply(m,n-1);
        return small;
    }
}
