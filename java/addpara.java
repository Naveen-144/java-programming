// functions with parameters
public class addpara {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void mul(int a,int b){
        System.out.println(a*b);
    }
    void div(int a, int b){
        System.out.println(a/b);
    }
    public static void main(String[] args) {
        addpara obj = new addpara();
        obj.sum(5,4);
        obj.mul(12,12);
        obj.div(9,3);
    }
    
}
