public class a14_strings_methods {
    public static void main(String[] args) {
        String name = "manish";
        // name.lenght(); returns lenght of string
        System.out.println(name.length());
        // name.toLowerCase(); returns a new string which has string which has all the lowecase characters from the string name
        String value = name.toLowerCase();
        System.out.println(value);
        // name.toUpperCase(); returns a new string which has string which has all the uppercase characters from the string name
        System.out.println(name.toUpperCase());
        // name.trim(); returns a trimmed string it will remove all spaces
        String nonTrimmed = "   Manish        ";
        System.out.println(nonTrimmed.trim());
        // name.substring(r); returns a substring from start to the end string(r)
        System.out.println(name.substring(2));
        // name.substring(s,r); returns a substring start from s to the end string r and a is included and r is excluded
        System.out.println(name.substring(1,4));
        //name.replace('r','p'); returns a new string after replacing r with p . it will replaces all 'r' with 'p'
        System.out.println(name.replace('m','h'));
        //name.replace(target:"",replacement:""); it will replace the target with replacement
        System.out.println(name.replace("h", "hman"));;
        // name.startsWith("target"); it will give true or false that the string is starts with the target or not
        System.out.println(name.startsWith("man"));
        // name.endsWith("target"); it will give true or false that the string is ends with the target or not
        System.out.println(name.endsWith("man"));
        // name.charAt(int); returns the character at a given index position int in this case
        System.out.println(name.charAt(2));
        // name.indexOf("str"); returns the index of the given string and it will give the index of first occurence
        System.out.println(name.indexOf("an"));
        /*name.indexOf("str", starting no); returns the index of the given string starting from the index starting no
                                           ,if the str doesn't exist it will give -1 */
        String modifiedName = "manisish";
        System.out.println(modifiedName.indexOf("is",4));
        // name.lastIndexOf("str"); returns the last index of the given string
        System.out.println(modifiedName.lastIndexOf("s"));
        //name.lastStringOf("r",n); returns the last index of the given string before and equals to index n 
        System.out.println(modifiedName.lastIndexOf("s",5));
        //name.equals("str"); returns true if the given string is equal to str otherwise rreturns false(case sensitive)
        // name.equalsIgnoreCase("str"); same as equals method but it is not case senstive
        System.out.println(name.equals("manish"));
        System.out.println(name.equalsIgnoreCase("Manish"));
        
        
    }

}
