package String_Practice;

public class String_GFG_Ce0 {
    public static void main(String[] args) {
        String s1="geeks";
        String s2="geeks";

        if(s1==s2){
            System.out.println("yes");
        }
        else
            System.out.println("no");

    String s3= new String("geeks");
    if(s1==s3) { //.equals comapare the content but == does not compare the content it only compare that refrence variavle
        System.out.println("yes");// is representing the same string or not
    }
    else
        System.out.println("no"); //bcz of String constant literal


    String s4="geeksforgeeks";
    String s5="geeksf";
        System.out.println(s4.contains(s5)); //contains fxn
    String s6="geek";
    String s7=s6;
    s6=s6+"sforgeeks";
        System.out.println(s6);
        System.out.println(s6.equals(s7));
    }
    }


