abstract class vehicle{
    abstract void speed();  //abstract function can't have body

}

class bike extends vehicle{
    void speed(){   ///we must override that abstract function
        System.out.println("5464");
    }
}

public class abstractmethod {
    public static void main(String[] args) {
        bike ob = new bike();
        ob.speed();

        
    }
    
}
