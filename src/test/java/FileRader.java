import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=new FileReader("BufferedWriter.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);

        System.out.println( bufferedReader.readLine());

    }
}
