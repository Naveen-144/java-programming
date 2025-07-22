public class func {
 void greetings(){       
        System.out.println("Vanakkam");
        don(); // can call a function inside a function
        naveen();
    }
    static void naveen(){
        System.out.println("naveen");
    }
    void don(){
        System.out.println("Don");
}
    public static void main(String[] args) {
        func obj = new func();
        obj.greetings(); //calling functions
        naveen(); // static to static function can call directly without creating object
// we cannot call normal function inside the static function 

    }
    
}
