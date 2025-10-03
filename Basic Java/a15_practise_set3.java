public class a15_practise_set3 {
    public static void main(String[] args) {
        //1
        String name = "MANISH IS MY NAME";
        name = name.toLowerCase();
        System.out.println(name);
        //2
        String text = "to lower case";
        text = text.replace(" ","_");
        System.out.println(text);
        //3
        String letter = "Dear name, Thanks a lot";
        letter = letter.replace("name","Manish");
        System.out.println(letter);
        //4
        String myString = "this string contain double  and triple   spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
        //5
        String letter2 = "Dear Harry,\n\t This Java Course is Nice.\n\t Thanks";
        System.out.println(letter2);


    }
}
