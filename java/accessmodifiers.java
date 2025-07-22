class PUB{
    public String a = "naveen";

}

class pri{
    @SuppressWarnings("FieldMayBeFinal")
    private String b = "DON";
    void display(){
        System.out.println(b);

    }
}
public class accessmodifiers {
    public static void main(String[] args) {
    PUB t = new PUB();
    System.out.println(t.a);  
    pri t2 = new pri();
    //System.err.println(t2.b);  so the private will not visible to other classes
    t2.display(); // only accesed with in the class
    }
    
}
// PUBLIC  : can be accessed from anywhere
// PRIVATE : can be accessed only inside the class
