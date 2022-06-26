//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//public class Fileservice {
//    private static final Gson GSON = new GsonBuilder();
//
//    private static final Path PATH = Paths.get("./database.json");
//
//    public static Row[] readFile() {
//        String json = "";
//        try {
//            json = Files.readString(PATH);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return GSON.fromJson(json, Row[].class);
//    }
//
//}
