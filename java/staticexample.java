class counter{
    static int count = 0;
    int instancenumber = 0;

    counter(){
        count = count+1;
        instancenumber = instancenumber+1;
    
    }
    void display(){
        System.out.println(count);
        System.out.println(instancenumber);
    }
}

public class staticexample {
    public static void main(String[] args) {
        counter c1 = new counter();
        c1.display();
        counter c2 = new counter();
        c2.display();
        counter c3 = new counter();
        c3.display();

       // c1.display();
       // c2.display();
       // c3.display();

        
    }
    
}
