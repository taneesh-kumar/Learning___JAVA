public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Taneesh");

        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'M');
        System.out.println(sb);

        sb.insert(3, 'i');
        System.out.println(sb);

        sb.delete(4, 6);
        System.out.println(sb);

        sb.append(" choudhary");
        System.out.println(sb);

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