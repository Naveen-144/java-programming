import java.util.Scanner;

public class sum6 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
        int a = scan.nextInt();
        if (a>35){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
        }
    }
    
}
