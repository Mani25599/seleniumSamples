import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Filewriter {
    public static void main(String[] args) throws IOException {
        String location="path.txt";
        String content="could you write this inside my path file";
//        //fileWriter
//        FileWriter filewriter=new FileWriter(location);
//        filewriter.write(content);

        //bufferedwriter
//        FileWriter filewriter=new FileWriter(location);
//        BufferedWriter bufferedWriter=new BufferedWriter(filewriter);
//        bufferedWriter.write(content);
//       bufferedWriter.close();

        //Fileoutputstream
//        FileOutputStream fileOutputStream=new FileOutputStream(location);
//      byte[] byte1=  content.getBytes();
//       fileOutputStream.write(byte1);
//       fileOutputStream.close();
        //path

        Path path= Paths.get(location);
        Files.write(path,content.getBytes());

    }
}
