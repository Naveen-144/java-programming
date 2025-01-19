import java.util.Scanner;
 class userscan {
    
    
    public static void main(String args[])
    {
         try (Scanner nav = new Scanner(System.in)) {
            int a = nav.nextInt();
            int b = nav.nextInt();
           // System.out.print(a);
            System.out.print(a+b);
        }
        
    }
    
}
