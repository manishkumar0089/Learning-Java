package rec_dsa1;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(pow(n,m));
        sc.close();
    }
    public static int pow(int n,int m){
        if(n==0 && m==0){
            return 1;
        }
        if(n==0) return 0;
        if(m==0) return 1;
        return n*pow(n,m-1);
    }
}
