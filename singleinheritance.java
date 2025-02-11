class animal{   // this is base class
    void eat()
    {
        System.out.println("this animal can eat");
    }
}

class dog extends animal{  // thui is derived class
    void bark(){
        System.out.println("barks");
    }
}
public class singleinheritance {
    public static void main(String[] args) {
        dog ob = new dog();
        ob.bark();
        ob.eat();

        
    }
    
}
