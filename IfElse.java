import java.util.*;

public class IfElse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int n = sc.nextInt();
        if (n>18){
            System.out.println("you are "+n+" hence you are an adult");
        }
        else{
            System.out.println("you are a minor");
        }
    }
}