import java.util.Scanner;

public class sum7 {
    
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int a = scan.nextInt();
            if(a%3 == 0 && a%5 == 0){
                System.out.println("the number both divisible by 3 and 5");
            }
            else{
                System.out.println("not divisible");
            }
        }
    }
}
