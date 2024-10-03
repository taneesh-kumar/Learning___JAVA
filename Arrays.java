import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        int [] name = new int[size];

        System.out.println("enter values");
        for(int i=0; i<size; i++){
            name[i] = sc.nextInt();
        }
        System.out.println("The values you entered are :");
        for( int i=0; i<size; i++){
            System.out.print(name[i]+" ");
        }

    }
}