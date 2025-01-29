import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            int i = 0;
            int n = scan.nextInt();
            int[] a = new int[n];
            for(i=0;i<n;i++){
                a[i] = scan.nextInt();
            }
            int score = 0;
            for(i=0;i<n;i++){
            
                score = score + a[i];
                System.out.print(a[i]+" ");
                
            }
            System.out.println(" ");
            System.out.println(score);
        }
    }
    
}
