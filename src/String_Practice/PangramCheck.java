package String_Practice;

public class PangramCheck {

    static boolean isPanagram(String s){
        int n=s.length();
        if(n<26){
            return false;
        }
        boolean Visited []=new boolean[26];
        String s1= s.toLowerCase();
        for (int i = 0; i <n; i++) {
            char x = s1.charAt(i);
            if (x >= 'a' && x <= 'z') {
                Visited[x - 'a'] = true;
            }
        }
            for (int i = 0; i < 26; i++) {
                if(Visited[i]==false){
                    return false;
                }

            }
            return true;
        }

    public static void main(String[] args) {
        //String s="Geeks";
        String s="The quick brown fox jumps over the lazy dog";
        System.out.println(isPanagram(s));
        
    }

}
