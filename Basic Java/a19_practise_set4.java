import java.util.Scanner;
public class a19_practise_set4 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    /*Question 2:
    System.out.println("Enter you marks in math");
    byte m1 = sc.nextByte();
    System.out.println("enter your physics marks");
    byte m2 = sc.nextByte();
    System.out.println("enter your chemistry marks");
    byte m3 = sc.nextByte();
    float avg = (m1+m2+m3)/3.0f;
    System.out.println("your overall percentage is " + avg);
    if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
        System.out.println("you have beem promoted to next class");
    }else{
        System.out.println("you are failed");
    }*/
    //Question 2:
    System.out.println("Enter your salary");
    float salary = sc.nextFloat();
    float tax = 0.0f;
    if(salary<=250000){
        tax = tax + 0;
    }
    else if(250000<salary && salary<= 500000){
        tax =  5*(salary-250000)/100.f;
    }
    else if(500000<salary&& salary<=1000000){
        tax =  tax + (5*250000)/100.f;
        tax =  tax + (20*(salary-500000))/100.f;
    }
    else if(1000000<salary){
        tax =  tax + (5*250000)/100.f;
        tax =  tax + (20*500000)/100.f;
        tax =  tax + (30*(salary-1000000))/100.f;

   }
   System.out.println(tax);
}
}
