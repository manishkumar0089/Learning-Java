public class a09_operator_precedence {
    public static void main(String[] args){
        int x = 6;
        int y = 1;
        int a = x * y/2;
        System.out.println(a);

    }
}
/* Precedence & Associativity
-highest precedence goes to * and / . they are then evaluated on the basis of left to right associativity
-- for + and - . associativity goes from left to right
- for ++ and = associativity goes from right to left

*/