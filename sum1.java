import java.util.Scanner;
public class sum1 {
    public static void main(String[] args) {
        try(Scanner nav = new Scanner(System.in)){
            int age = nav.nextInt();
            String name = nav.nextLine();
            System.out.println("my age is"+age);
            System.out.println("my name is "+name);

        }
        
    }
    
}
