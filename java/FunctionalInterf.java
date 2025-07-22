interface Don {  // Class names should start with uppercase as per Java conventions
    void display();
}

public class FunctionalInterf {
    public static void main(String[] args) {
        Don d = new Don() {   // Anonymous class implementing the interface
            public void display() {
                System.out.println("Naveen is Don");
            }
        };
        d.display();
    }
}
    

