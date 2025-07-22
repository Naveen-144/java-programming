import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class bufferwrit {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("output.txt",true); // true is used appen without clearing previous data
            try (BufferedWriter bw = new BufferedWriter(fw)) {
                bw.write("hey man");
                bw.newLine();
                bw.write("are u okay baby");
            }
        }
        catch (IOException e){
            System.out.println("something wrong");

        }
    }
    
}
