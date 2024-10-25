public class InvertString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("TaneesH");

        for(int i=0; i<sb.length()/2; i++){
            int frount = i;
            int back = sb.length()-1-i;

            char frountChar = sb.charAt(frount);
            char backChar = sb.charAt(back);

            sb.setCharAt(frount, backChar);
            sb.setCharAt(back, frountChar);

        }
        System.out.println(sb);
    }    
}