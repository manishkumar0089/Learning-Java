package rec_dsa2;
public class String_to_integer {
    public static void main(String[] args) {
        String str = "0011102340";
        System.out.println(replace(str));
        // System.out.println(replace_better(str));
        System.out.println(replace_better(str, 0L));
    }
    public static int replace(String str){
        if(str.length()==0) return 0;
        int ans = (int) ((str.charAt(0) - 48 )* (Math.pow(10,str.length()-1)));
        int small = replace(str.substring(1));
        return ans + small;
    }
    // public static int replace_better(String str){
    //     if(str.length() == 1) return str.charAt(0) - 48;
    //     int small = replace_better(str.substring(0,str.length()-1));
    //     int s = (str.charAt(str.length()-1) - 48 );
    //     return s + small*10;
    // }
    public static long replace_better(String str, long ans){
        if(str.length()==0) return ans;
        char c = str.charAt(0);
        return replace_better(str.substring(1), ans*10 +(c -'0'));
    }
}
