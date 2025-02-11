class animal{
    void eat()
    {
        System.out.println("eat");
    }
}

class dog extends animal{
    void bark()
{
    System.out.println("barks");
}
}

class puppy extends dog{
    void weep(){
        System.out.println("weeps");
    }
}
public class multilevelinheritance {
    public static void main(String[] args) {
        puppy ob = new puppy();
        ob.weep();
        ob.bark();
        ob.eat();
        
    }
    
}
