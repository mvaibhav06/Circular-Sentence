public class CircularSentence {
    public boolean isCircularSentence(String sentence) {
        String[] inp = sentence.split(" ");
        for(int i=0; i<inp.length-1; i++){
            String a = inp[i];
            String b = inp[i+1];
            char c1 = a.charAt(a.length()-1);
            char c2 = b.charAt(0);
            if(c1 != c2){
                return false;
            }
        }
        char a = inp[0].charAt(0);
        char b = inp[inp.length-1].charAt(inp[inp.length-1].length()-1);
        if(a!=b) return false;
        return true;
    }
}
