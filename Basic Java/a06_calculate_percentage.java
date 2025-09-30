import java.util.Scanner;
public class a06_calculate_percentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("accontancy");
        float accountancy = sc.nextFloat();
        System.out.println("economics");
        float economics = sc.nextFloat();
        System.out.println("english");
        float english = sc.nextFloat();
        System.out.println("physical");
        float physical = sc.nextFloat();
        System.out.println("business");
        float business = sc.nextFloat();
        System.out.println("marks of students are");
        System.out.println("accoutancy :"+accountancy+"\n" + "economics :"+economics+"\n" +
         "english :"+english+"\n" +"physical :"+physical+"\n"+"business :"+business+"\n");
        float sum = accountancy + economics + english+ physical+ business;
        System.out.println("total marks"+sum);
        float percentage = sum/5;
        System.out.println("percentage" + percentage);

        
    }
    
}
