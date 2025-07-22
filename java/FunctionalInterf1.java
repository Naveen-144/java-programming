interface Don {
    void display();
}
public class FunctionalInterf1 {
    
    public static void main(String[] args) {
        Don d = () -> System.out.println("Naveen is Don");  // Lambda expression
        d.display();
    }
}
