import java.util.Scanner;

public class school1 {
    String passorfail(int mark){
        if(mark>35){
            return "pass";
        }
        else{
            return "fail";

        }
    }

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            school1 obj = new school1();
            int mark = scan.nextInt();
            String a = obj.passorfail(mark);
            System.out.println(a);
        }
    }
    
}
