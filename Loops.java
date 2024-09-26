import java.util.*;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        do{
            System.out.println("Enter the number");
            int n = sc.nextInt();
            for(int i=1; i<=n; i++){
            System.out.print(i+" ");
            }
            System.out.println("Want to continue? yes[1] No[0]");
            input = sc.nextInt();
        }while(input == 1);
    }    
}