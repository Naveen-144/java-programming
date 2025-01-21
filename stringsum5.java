import java.util.Scanner;

public class stringsum5 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            String RCB = scan.nextLine();
            // if(RCB=="win")..... we cannot compare like this
            if(RCB.equals("win")){
                System.out.println("ee sala cup namathe");
            }
            else{
                System.out.println("cup illa");
            }

        }
    }
    
}
