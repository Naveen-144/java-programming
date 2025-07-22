public class stringcompae {
    public static void main(String[] args) {
        String a = new String("naveen");
        String b = new String("naveen");
        String c = "naveen";
        String d = "naveen";
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(a.equals(b));
        if(a.equals(b)){
            System.out.println("yes");
        }
    }
    
}
