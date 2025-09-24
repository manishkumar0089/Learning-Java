package rec_dsa2;

public class replace_character {
    public static void main(String[] args) {
        String str = "abacd";
        System.out.println(replace(str,'a','x'));
    }
    public static String replace(String str,char c1,char c2){
        if(str.length()==0) return "";
        String output = "";
        if(str.charAt(0)==c1){
            output += c2;
        }
        else{
            output += str.charAt(0);
        }
        String ans = replace(str.substring(1), c1, c2);
        return output + ans;
    }
}
