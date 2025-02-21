public class Recurtion {
    public static void PrintNum(int m){
        if (m == 0) {
            return;
        }
        System.out.println(m);
        PrintNum(m-1);
    }
    public static void main(String[] args) {
        int n = 10;
        PrintNum(n);
    }
}
