public class constructor {
    int marks;
    String name;

    constructor(){
        System.out.println("hello");
    }
    constructor(int marks,String name ){
        this.marks=marks;
        this.name = name;

    }
    constructor(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        constructor ob1 =new constructor(45,"naveen");
        System.out.println(ob1.marks);
        System.out.println(ob1.name);
        constructor ob2 = new constructor("naveen");
        System.out.println(ob2.name);
    }
    
}
