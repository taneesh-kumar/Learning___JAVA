import java.util.*;

public class Functions {
    public static long CalculateFactorial(int a){
        long num = 1;
        for(int i=1; i<=a; i++){
            num = num*i;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        System.out.println(CalculateFactorial(a));
    }    
}