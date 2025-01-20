import java.util.Scanner;
public class sum2 {
    public static void main(String[] args) {
        try(Scanner nav = new Scanner(System.in)){
            String name = nav.nextLine();
            String address = nav.nextLine();
            int age = nav.nextInt();
            System.out.println("my age is"+age);
            System.out.println("my name is "+name);
            System.out.println("address"+address);

        }
        
    }
    
}
