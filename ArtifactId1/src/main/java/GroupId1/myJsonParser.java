package GroupId1;

import com.google.gson.*;
//import com.sun.tools.javac.util.Assert;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Iterator;

public class myJsonParser {

    public void ReadFile(String filePath) throws IOException {
        System.out.println(filePath);

        try {
            JsonParser parser = new JsonParser();
            JsonElement rootElem = parser.parse(new FileReader(filePath));
            com.google.gson.JsonArray ary = rootElem.getAsJsonArray();
            for (int i = 0; i < ary.size(); i++) {
                JsonObject obj = ary.getAsJsonObject();
            }
            //System.out.println(rootElem.getAsJsonArray().getAsString());
        } catch (JsonIOException e) {
            e.printStackTrace();
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
