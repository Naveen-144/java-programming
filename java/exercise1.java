class animal{
    String name;
    int age;
    void makesound(){
        System.out.println("animal makes sound");
    }
}

class dog extends animal{
    String breed;
    //override
    void makesound(){
        System.out.println("dog barks");
        
    }
    void fetch(){
        System.out.println("dog fetching");
            
    }
}

public class exercise1 {
    public static void main(String[] args) {
        
        dog ob = new dog();
        ob.makesound();
        ob.age = 10;
        ob.name = "don";
    }
    
}
