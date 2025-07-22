public class thiskey {
    String myname;

    thiskey(){
        System.out.println("hello");
    }

    void setname(String myname){
        this.myname = myname;
       
    }

    public static void main(String[] args) {
        
        thiskey ob = new thiskey();
        ob.setname("naveen");
        System.out.println(ob.myname);
        
    }
    
}
