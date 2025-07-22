public class ret {
    int naveen(int a){
        a= 20 - 18;
        return a;
    }
    int sum(int c,int d){ 
       
        return c+d;
    }
    public static void main(String[] args) {
        ret obj = new ret();
        int b = obj.naveen(20);
        int e = obj.sum(20,30);
        System.out.println(b);
        System.out.println(e);
    }
    
}
