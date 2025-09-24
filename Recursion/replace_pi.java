package rec_dsa2;

public class replace_pi {
    public static void main(String[] args) {
        String str = "xpixpi";
        System.out.println(replace(str));
    }
    public static String replace(String str){
        if(str.length()==0) return str;
        String output;
        String small_ans = replace(str.substring(1));
        if(str.charAt(0)=='p' && small_ans.charAt(0)=='i'){
            output = "3.14" + small_ans.substring(1);
        }
        else output = str.charAt(0) + small_ans;
        return output;
    }
}
