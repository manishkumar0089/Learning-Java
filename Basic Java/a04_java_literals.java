public class a04_java_literals {
    public static void main(String[] args){
        byte age = 34;
        // here 34 is literal
        char ch = 'h';
        float f1 = 5.6f;
        // if we didnot put f in literal it will be a double data type by default
        // here h and 5.6f are literals
        long l1 = 45645654l;
        // if we have to use long data type we have to put l and L after literal if we didn't put it will be int data type by default
        double d1 = 10.65d;
        //'for string literal' we have to use (" ") double quotes 
        String s = "Manish";
        System.out.println(age);
        System.out.println(ch);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(l1);
        System.out.println(s);
    }
}