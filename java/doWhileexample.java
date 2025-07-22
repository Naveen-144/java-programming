import java.util.Scanner;

public class doWhileexample {
    public static void main(String[] args) {
        int a =0;
        try(Scanner scan= new Scanner (System.in)){
        do{
            System.out.println("Enter the number: ");
            
                 a = scan.nextInt();


            
        }while(a<10);
    }
}
    
}
