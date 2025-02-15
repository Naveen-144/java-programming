class parent{

    int age = 12;

    parent(String name){
        System.out.println("parent");
        System.out.println(name);
        

    }
    void call(){
        System.out.println("call");
    }
}

class child extends parent{
    child(){
        //calling superclass constructor from subclass
        super("don");
        //calling functions
        super.call();  
        //accessing field of parent class
        System.out.println(super.age);
        System.out.println("child");
    }
}
public class superkeyword {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        child ob = new child();
        
    }
    
}
