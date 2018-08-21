package toong.vn.androidgson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import toong.vn.androidgson.model.Person;

public class JsonObjectToJavaObjectActivity extends AppCompatActivity {
    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String person1JsonString = "{\"age\":1,\"gender\":\"male\",\"name\":\"A\"}";
        JsonParser parser = new JsonParser();
        JsonObject jsonObject = parser.parse(person1JsonString).getAsJsonObject();

        Person person1 = new Gson().fromJson(jsonObject, Person.class);
    }
}
