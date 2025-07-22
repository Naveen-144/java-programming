import java.util.Scanner;

public class middleofanarray {
    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){
            int n = scan.nextInt();
            int i;
            int[] a = new int[n];
            for(i=0;i<n;i++){
                a[i]=scan.nextInt();
            }
    int b = n/2;
    System.out.println(a[b]);
        }
    }
    
}
