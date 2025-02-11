class animal{
    void eat(){
        System.out.println("can eat");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("can barks");
    }
}

class cat extends animal{
    void meow(){
        System.out.println("can meow");
    }
}
public class heirarchyinheritance {
    public static void main(String[] args) {
        dog ob = new dog();
        ob.bark();
        ob.eat();
        cat ob1 = new cat();
        ob1.meow();
        ob1.eat();
    
        
    }
    
}
