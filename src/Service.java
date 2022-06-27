import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class Service implements Connectable {
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final Path PATH = Paths.get("./rows.json");


    public static Row[] readFile() {
        String json = "";
        try {
            json = Files.readString(PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return GSON.fromJson(json, Row[].class);
    }

    public static void writeFile (Row[] rows) {
        String json = GSON.toJson(rows);
        System.out.println(json);
    }

    @Override
    public void openConnection() {
        System.out.println("------Database------");
        Row[] rows = Service.readFile();
        for (Row row : rows) {
            System.out.println(row);
        }
    }

    @Override
    public void closeDataBaseGonnection() {
    }

    @Override
    public void checkBaseConnection() throws Exception { // проверить есть ли соединение с базой
        throw new Exception("Connection closed, no action can be performed"); //соединеине закрыто
    }

    @Override
    public void readString() {
    }

    @Override
    public void keyRecord() throws Exception {
        throw new Exception("Warning! abc key and ABC key are different, write the correct key ");
    }

    @Override
    public void readKeyRecord() throws Exception {
        throw new Exception("No such record");
    }

    @Override
    public void readSomeEntries() {
    }

    @Override
    public void EntriesNumber() {
    }

    @Override
    public void addNote() throws Exception {
        throw new Exception("You can add a record to the database only through a separate method.");
    }

    @Override
    public void entryIndexUpdate() throws Exception {
        throw new Exception("There is no such record in the database");
    }

    @Override
    public void contentKey() throws Exception {
        throw new Exception("There is no such record in the database");
    }
}

