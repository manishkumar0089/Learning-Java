import java.util.Scanner;
public class a18_switch_case_statements {
    public static void main(String[] args){
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("you are going to vote now");
                break;
            case 23:
                System.out.println("you are going to join job");
                break;
            case 60:
                System.out.println("you are going to retired");
                break;
            default:
                System.out.println("enjoy your life");
        }
    }
}
