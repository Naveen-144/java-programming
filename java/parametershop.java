public class parametershop {
    void soap(int money){
        System.out.println(money); // this is parameterd function the variable is parameter or argument
        System.out.println("soap purchased");
    }
    void choclate(int money){
        System.out.println(money);
        System.out.println("purchased");
    }
    
    public static void main(String[] args) {
        parametershop obj = new parametershop();
        obj.soap(20);
        obj.choclate(31);
        
    }
}
