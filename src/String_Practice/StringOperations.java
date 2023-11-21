package String_Practice;

public class StringOperations {
    public static void main(String[] args) {
        //equalsIgnoreCase
        String str1="Hello";
        String str2="hELLo";
        System.out.println(str1.equalsIgnoreCase(str2));

        //lets move forward
        //toUpperCase
        //toLowercase same as toUpperCase

        System.out.println(str1.toUpperCase());
        System.out.println(str2.toUpperCase());

        //Capitalize() //its not working
        //from this Operation only 1st letter will be capitalize
        System.out.println();
        //Substring(start index, End index+1
        System.out.println(str1.substring(2,5));
        System.out.println(str1.substring(1));
    }
}
