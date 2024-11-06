import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Objects;

public class Jsonwriter {
    public static void main(String[] args) throws IOException, ParseException {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("Name","stalen");
        jsonObject.put("Age",23);
        JSONArray array=new JSONArray();
        array.add("magic");
        array.add("stunt");

        jsonObject.put("array",array);

        FileWriter fileWriter=new FileWriter("Jsonfile.json");
        fileWriter.write(jsonObject.toJSONString());
        fileWriter.close();


        JSONParser jsonParser=new JSONParser();
        FileReader fileReader=new FileReader("Jsonfile.json");
        Object object1 =jsonParser.parse(fileReader);
       JSONObject jsonObject1= (JSONObject)object1;
      String name= (String)jsonObject1.get("Name");
     Long Age =(Long)jsonObject1.get("Age");
     JSONArray array2=(JSONArray)jsonObject1.get("array");
        Iterator iterator=array2.iterator();
        System.out.println(name);
        System.out.println(Age);
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
