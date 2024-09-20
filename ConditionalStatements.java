import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Preffered Language");
        int n = sc.nextInt();
        switch (n) {
            case 1: System.out.println("namaste");
            break;
            case 2: System.out.println("Hola");
            break;
            case 3: System.out.println("Nǐ hǎo");
            break;
            case 4: System.out.println("bonjour");
            break;
            case 5: System.out.println("Chio");
            break;
            case 6: System.out.println("Konnichiwa");
            break;
            default: System.out.println("Invalid Entry");
            break;
        }
    }
}
