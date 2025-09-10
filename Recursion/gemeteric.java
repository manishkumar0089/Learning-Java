package rec_dsa1;
import java.util.*;
public class gemeteric {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(gem_sum(n));
        sc.close();
    }
    public static double gem_sum(int n){
        if(n==0) return 1;
        return  gem_sum(n-1) + 1/Math.pow(2,n);
    } 
}
