class nav{
    final void display(){
        System.out.println("naveen");
    }
}

class don extends nav{
    
}
public class finalmethod {
    public static void main(String[] args) {
        don t = new don();
        t.display();
    }
    
}// we cannot override final value

