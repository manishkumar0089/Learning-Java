package rec_dsa2;

public class remove_X {
    public static void main(String[] args) {
        String str = "xabxcxsxdx";
        System.out.println(removeX(str));
    }
    public static String removeX(String str){
        if(str.length()== 0){
            return str;
        }
        String ans = "";
        if(str.charAt(0) != 'x'){
            ans = ans + str.charAt(0);
        }
        String small_ans = removeX(str.substring(1));
        return ans + small_ans;
    }
}
