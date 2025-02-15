class person{
    String name;
    person(String name){
        this.name = name;
    }
}

class employee extends person{
    employee(String name){
        super(name);
    }
}

public class super2 { 
    public static void main(String[] args) {
        employee ob = new employee("naveen");
        System.out.println(ob.name);
        
    }
    
}
