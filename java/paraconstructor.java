public class paraconstructor {
    
    paraconstructor(int a){
        System.out.println(a);
        System.out.println("hello");
    }

    paraconstructor(){
        System.out.println("empty constructor");
    }

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        paraconstructor ob = new paraconstructor(10);
        @SuppressWarnings("unused")
        paraconstructor ob2 = new paraconstructor();
    }
    
}
