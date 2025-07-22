import java.util.Scanner;

public class exceptionhand {
    @SuppressWarnings({ "unused" })
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
        int a = scan.nextInt();
        int b = 10/0;
        }
        catch(Exception e){ //we can also mention which exception to handle
            System.out.println(e);
        }
        //catch(ArithmeticException e){
          //  System.out.println(e);  //like we can also specific the exception handling
        //}
        
        // finally  keyword will execute the method wheather there is error is prestent or not
        System.out.println("program ended");
        scan.close();
    }
    
    
}
