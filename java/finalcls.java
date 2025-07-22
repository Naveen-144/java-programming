final class a{
    void display(){
        System.out.println("naveen");
    }
}
//class b extends a{
// if a class is final we cannot inherit the cls
//}
public class finalcls {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        a t = new a();
        t.display();
        
    }
    
}
