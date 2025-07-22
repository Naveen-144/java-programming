import java.util.Scanner;
public class Whilebyarray {
    public static void main(String[] args) {
        int n=5;
        int[] a = new int[n];
        int i =0;
        try (Scanner scan = new Scanner(System.in)) {
            while(i<n){
                a[i]=scan.nextInt();
                i++;
                
            }
            i=0;
            System.out.println("the array terms are");
            while(i<n){
                System.out.println(a[i]);
                i++;
            }
        }

    }
    
    
}
