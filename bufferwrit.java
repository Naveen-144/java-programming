import java.io.BufferedWriter;
import java.io.FileWriter;

public class bufferwrit {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("output.txt",true); // true is used appen without clearing previous data
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("hey man");
            bw.newLine();
            bw.write("are u okay baby");
            bw.close();
        }
        catch (Exception e){
            System.out.println("something wrong");

        }
    }
    
}
