

interface animal{
    int mark = 20;
    void sound(); //defaultly it is abstract method so it do not specify body
}

class cat implements animal{  //we can implement the interface in the class

public void sound(){
    System.out.println("meoww..");
}
}
public class interfa {
    public static void main(String[] args) {
      // we cannot create objevct for interface  
      cat c1 = new cat();
      c1.sound();
      System.out.println(c1.mark);

    }
    
}
