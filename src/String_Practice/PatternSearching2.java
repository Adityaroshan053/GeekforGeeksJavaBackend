package String_Practice;

public class PatternSearching2 {
    static String digitsAfterDecimal(String no){
        int pos=no.indexOf('.');
        if(pos<0){
            return "";
        }
        else
            return no.substring(pos+1, no.length());
    }

    public static void main(String[] args) {
        String no="12.385";
        digitsAfterDecimal(no);
        System.out.println(digitsAfterDecimal(no));


    }
}
