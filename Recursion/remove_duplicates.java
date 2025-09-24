package rec_dsa2;

public class remove_duplicates {
    public static void main(String[] args) {
        String str = "amaabbddd";
        System.out.println(replace(str));
    }
    public static String replace(String str){
        if(str.length() <=1) return str;
        String output = "";
        String small = replace(str.substring(1));
        if(str.charAt(0)==small.charAt(0)){
        output = small;}
        else{
            output = str.charAt(0) + small;
        }
        return output;
    }
}
