import java.util.Scanner;

public class School {
    String pass( ){
        return "pass";
    }

    String fail(){
        return "fail";

    }

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            School obj = new School();
            int mark = scan.nextInt();
            if(mark>= 35){
                 String a = obj.pass();
                 System.out.println(a);

            }
            else{
                String b = obj.fail();
                System.out.println(b);

            }
        }
    }
    
}
