package rec_dsa1;
import java.util.Scanner;
public class sumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(natural( n));
        sc.close();
    }
    public static int natural(int n){
        if(n==1) return 1;
        return n+natural(n-1);
    }
    
}
