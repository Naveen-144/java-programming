public class methodoverloading {
    // function name can be same but not parameters
     void sum(int a,int b){
        System.out.println(a+b);
     }
     void sum(int c, int d, int e){
        System.out.println(c+d+e);
     }
           // number of parameters also should not same i think
   public static void main(String[] args) {
        methodoverloading obj = new methodoverloading();
        obj.sum(20,30);
        obj.sum(30, 0,30);
     }
}
