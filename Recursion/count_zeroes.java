import java.util.Scanner;
public class count_zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(count(n));
        sc.close();
    }
    public static int count(int n){
        if(n<10){
            if(n==0) return 1;
            else return 0;
        }
        if(n%10 == 0) return 1+count(n/10);
        else return count(n/10);
    }
}
