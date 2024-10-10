import java.util.*;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String FirstName = "taneesh";
        String MiddleName = "Kumar";

        String name = FirstName+" "+MiddleName;
        // string length or number of charecters
        System.out.println("Numbers of charecters are : ");
        System.out.println(name.length());
        
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i)+" ");
        }
        System.out.println();

        if(FirstName.compareTo(MiddleName) == 0){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Strings are not equal");
        }
    }
}