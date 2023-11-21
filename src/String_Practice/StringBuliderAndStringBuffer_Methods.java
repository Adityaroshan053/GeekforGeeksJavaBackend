package String_Practice;

public class StringBuliderAndStringBuffer_Methods {
    public static void main(String[] args) {
        /* _Method Same as String
        length(), charAt(index), indexOf(str), indexOf(str,from index), lastIndexOf(str), lastIndexof(str, fromIndex), compareTo(sb),
        substring(beginIndex), substring(beginIndex ,endIndex) .....chars()

         */
        /*
        _New Method
        append(x){x can be boolean,int,char,String,float,objext},insert(offset,x), SetCharAt(index,c),
         reverse(), deleteCharAt(), delete(start,end), capacity(), replace(start, end, str)
         */
         //Same output for Strinf Buffer Also
        /*
        StringBuffer is thread safe & Mutable
        StringBuilder in only Mutable 
         */
        StringBuilder sb=new StringBuilder("dcba");
        sb.reverse();
        System.out.println(sb); //abcd
        sb.append("efg");
        System.out.println(sb); //abcdefg
        sb.setCharAt(1,'h');
        System.out.println(sb);
        sb.delete(0,2);
        System.out.println(sb); //cdefg
        sb.insert(1,"efg");
        System.out.println(sb);
    }
}
