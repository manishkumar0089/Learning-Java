import java.util.Scanner;
public class a05_take_user_input {
    public static void main(String[] args){
        System.out.println("Taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first no :");
        int a = sc.nextInt();
        System.out.println("enter 2nd no:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum of these no is");
        System.out.println(sum);



    }
    
}
