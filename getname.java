

public class getname {
    String name(String a ){
        return a;
    }
    String name2()
    {
        return "NAVEEN";
    }
    public static void main(String[] args) {
        
        getname obj = new getname();
        
                String a = obj.name( "naveen");
                String b = obj.name2();
                System.out.println(a);
                System.out.println(b);
    }

    
}
