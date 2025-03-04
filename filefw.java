import java.io.FileWriter;
import java.io.IOException;

public class filefw {
    public static void main(String[] args) {
        try{
            try (FileWriter fw = new FileWriter("output.txt",true)) {
                fw.append("Naveen");
                //fw.write("hello") to write content in file
            }
    }
    catch (IOException e){
        System.out.println("something wrong");
    }
}
}
