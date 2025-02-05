// this is to understand what is class and object
public class hotel {
    int coffee = 10;
    int tea = 20;
    public static void main(String[] args) {
        //server 1
        hotel server1 = new hotel(); // syntax for creating an object
        System.out.println(server1.coffee);

        //server2
        hotel server2 = new hotel();
        System.out.println(server2.tea); // so we can create multiple objects in class
        
    }

    
}
