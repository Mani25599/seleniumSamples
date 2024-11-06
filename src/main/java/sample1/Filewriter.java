package sample1;
import java.io.FileWriter;
import java.io.IOException;

public class Filewriter {
    public static void main(String[] args)  {
        try {
            FileWriter fw = new FileWriter("filecreated1.txt");
            fw.append("this is new line");
            fw.close();
            System.out.println("file is written and saved");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
