import java.util.Scanner;


public class Find {
    
  void evenorodd(int num){

if(num%2==0){
   System.out.println("even");
}
else{
    System.out.println("odd");
}
    }
public static void main(String[] args) {

    try(Scanner scan = new Scanner(System.in)){
        Find obj = new Find();
        int num = scan.nextInt();
        obj.evenorodd(num);
    }   
    
}

}
 