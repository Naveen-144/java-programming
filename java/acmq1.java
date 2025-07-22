class person{
    public String name ;
    protected  int age;
    //private int ssd;
    String adress;

    person(String name,int age ,  String adress){

        this.name = name;
        this.age = age;
        //this.ssd = ssd;
        this.adress = adress;
    }
 
}

class employee extends person{

     employee(String name , int age,  String adress) {
        super(name,age,adress);
        System.out.println("hello");
    }
    
   

}
public class acmq1 {
    public static void main(String[] args) {
        employee p = new employee("naveen", 20, "sivagangai");

        System.out.println(p.name);
        System.out.println(p.age);
        //System.out.println(p.ssd);
        System.out.println(p.adress);
        // we cannot access private data from another class
        
    }
    
}
 