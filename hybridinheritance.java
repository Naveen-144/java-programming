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

class puppy extends dog{
    void weep()
    {
        System.out.println("can weep");
    }
}
public class hybridinheritance {
    public static void main(String[] args) {
        puppy ob = new puppy();
        ob.bark();
        ob.eat();
        ob.weep();
        cat ob1 = new cat();
        ob1.meow();
        ob1.eat();
    
        
    }
    
}
