public class constructor {
    int marks;
    String name;

    constructor(){
        System.out.println("hello");
    }
    public static void main(String[] args) {
        constructor ob1 =new constructor();
        System.out.println(ob1.marks);
        constructor ob2 = new constructor();
        System.out.println(ob2.name);
    }
    
}
