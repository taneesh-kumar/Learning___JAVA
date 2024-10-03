import java.util.*;

public class LinearSearchArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size");
        int size = sc.nextInt();
        int [] num = new int[size];

        System.out.println("Array Input");
        for(int i=0; i<size; i++){
            num[i] =  sc.nextInt();
        }

        System.out.println("Search Array...");
        int x = sc.nextInt();

        for(int i=0; i<size; i++){
            if (num[i] == x) {
                System.out.println(x+" found at index : "+num[i]);
            }
        }
    }    
}