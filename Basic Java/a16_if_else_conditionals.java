import java.util.Scanner;
public class a16_if_else_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Write age: ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Yes,\nyou are eligible to vote now");
        }
        else{
            System.out.println("No,\nyou are not eligible to vote");
        }
        /*
        for logical operators
        && - AND
        || - OR
        ! - NOT
        */
        boolean a = true;
        boolean b = false;
        if(a&&b){
            System.out.println("this is true");
        }
        else{
            System.out.println("this is false");
        }
    }
}
