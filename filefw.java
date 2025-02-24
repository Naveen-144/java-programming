import java.io.FileWriter;

public class filefw {
    public static void main(String[] args) {
        try{
        FileWriter fw = new FileWriter("output.txt",true);
        fw.append("Naveen");
        //fw.write("hello") to write content in file
        fw.close();
    }
    catch (Exception e){
        System.out.println("something wrong");
    }
}
}
