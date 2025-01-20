import java.util.Scanner;

public class sum3 {
    public static void main(String[] args) {
        try(Scanner nav = new Scanner(System.in)){
            int a = nav.nextInt();
            int b = nav.nextInt();
            int c = nav.nextInt();
            double d = a*b*c;
            double e = a+b+c;
            System.out.println(d);
            System.out.println(e);
            System.out.println(d/e);
        }
    }
    
}
