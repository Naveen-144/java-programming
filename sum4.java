import java.util.Scanner;
public class sum4 {
    public static void main(String[] args) {
        try(Scanner nav = new Scanner(System.in)){
            String name = nav.nextLine();
            String department =nav.nextLine();
            double score = nav.nextDouble();
            System.out.println(name);
            System.out.println(score/10);
            System.out.println(department);

        }
    }
    
}
