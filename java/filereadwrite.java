import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// file write read and buffer write and read is executed
public class filereadwrite {
    public static void main(String[] args) {
        try{
            try (FileWriter fw = new FileWriter("naveen.txt")) {
                fw.write("naveen the don");
            }
            try (FileReader fr = new FileReader("naveen.txt")) {
                int c = fr.read();
                while(c != -1){
                    System.out.print((char)c);
                    c = fr.read();
                }
            }
            FileWriter f2 = new FileWriter("thala.txt");
            try (BufferedWriter bw = new BufferedWriter(f2)) {
                bw.newLine();
                bw.write("thala is beautiful");
                bw.newLine();
                bw.write("thala the don");
            }
            FileReader fr2 = new FileReader("thala.txt");
            try (BufferedReader br = new BufferedReader(fr2)) {
                String line = br.readLine();
                while(line != null){
                    System.out.println(line);
                    line = br.readLine();
                    
                }
            }

           
        }

        catch(IOException e){
            System.out.println("something is wrong");

        }
    }
    
}
