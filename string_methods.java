import java.util.Locale;

public class cwh_14_string_methods {
    public static void main(String[] args) {
        String name = "Ash";
        System.out.println(name);

        // Commonly used string methods
        // Note:- index value starts from 0 in case of strings in java.

        // name.length() -->> returns length of the string. (3 in this case).
        int value = name.length();

        //name.toLowerCase() -->> turns the string in lower case. (ash in this case)
        String lstring = name.toLowerCase();

        //name.toUpperCase() -->> turns the string in upper case. (ASH in this case)
        String ustring = name.toUpperCase();

        //nonTrimmedString.trim() -->> returns a new string after removing all the leading and trailing spaces from the original string.
        String nonTrimmedString = "       Ash   ";
        System.out.println(nonTrimmedString);
        String trimmedString = nonTrimmedString.trim();

        //name.substring(int start) -->> returns substring starting from the index specified. (kash in this case)
        String myName = "Aakash";
        System.out.println(myName.substring(2));

        //name.substring(int start, int end) -->> returns substring from start index to the end index. start index is included and end index is excluded. (kas in this case)
        System.out.println(myName.substring(2,5));

//        name.replace('h','s') -->> returns a new string after replacing h with s. (Aakass in this case).
        System.out.println(myName.replace('h','s'));
        System.out.println(myName.replace("a","ss")); // -->> can also replace string. (Assksssh in this case)

//        name.startsWith(); -->> returns in boolean form
        System.out.println(myName.startsWith("Aa"));

        //name.endsWith();
        System.out.println(myName.endsWith("sh"));

        //name.charAt(2) -->> returns character at a given index position. (k in this case)
        System.out.println(myName.charAt(2));

        //name.indexOf(A); -->> returns the index of the given string. (0 in this case)
        System.out.println(myName.indexOf("A"));

        String modifiedName = "Aakashash";
        System.out.println(modifiedName.indexOf("ash"));
        System.out.println(modifiedName.indexOf("ash",5)); // -->> start searching from index specified and will also return -1 if no match found

        //name.lastIndexOf() -->> returns the last index of the given string. (6 in this case)
        System.out.println(modifiedName.lastIndexOf("ash"));
        System.out.println(modifiedName.lastIndexOf("ash",5)); //-->> before index 5

//        name.equals("ash");
        System.out.println(name.equals("Ash")); //-->> case sensitive

        //name.equalsIgnoreCase("ash") -->> ignores the case of the string.. simply ignores the case sensitivity.
        System.out.println(name.equalsIgnoreCase("ash"));

        // character after backslash ‘\’ = Escape Sequence Characters
        // Escape Sequence Characters consist of more than one character but represent one character when used within the strings.
        // Examples: \n (newline), \t (tab), \’ (single quote), \\ (backslash)
        System.out.println("new line \n next line");
        System.out.println("new tab \t word after tab");
        System.out.println("\"double quoted\"");
        System.out.println("backslash\\");

    }
}
