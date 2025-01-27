import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = 10;
            //int d = --c;
            //int e = c--;
            System.out.println(--c);
            for(int i = b;i >= a;--i){
                System.out.println(i);
            }
        }
    }
    
}
