import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class JsonParserUtility {
    public static List<User> parseJsonFile(String filePath) {
        List<User> userList = null;

        try (FileReader reader = new FileReader(filePath)) {
            Gson gson = new Gson();
            Type userListType = new TypeToken<List<User>>(){}.getType();
            userList = gson.fromJson(reader, userListType);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return userList;
    }
}
