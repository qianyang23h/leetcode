public class ReplaceSpace {
    public String replaceSpace(String s) {
        char[] replace = new char[s.length() * 3];
        int j = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                replace[j++] = s.charAt(i);
            }
            else{
                replace[j++] = '%';
                replace[j++] = '2';
                replace[j++] = '0';
            }
        }
        String output = new String(replace);
        return output;
    }

    public static void main(String[] args) {
        
    }
}
