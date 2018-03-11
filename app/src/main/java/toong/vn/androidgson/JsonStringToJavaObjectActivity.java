package toong.vn.androidgson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.google.gson.Gson;

public class JsonStringToJavaObjectActivity extends AppCompatActivity {
    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String person1JsonString = "{\"age\":1,\"gender\":\"male\",\"name\":\"A\"}";
        Person person1 = new Gson().fromJson(person1JsonString, Person.class);
    }
}
