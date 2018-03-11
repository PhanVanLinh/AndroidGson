package toong.vn.androidgson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import com.google.gson.Gson;

public class JavaObjectToJsonStringActivity extends AppCompatActivity {
    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person person1 = new Person("A", 1, "male");
        String person1Json = new Gson().toJson(person1);
        Log.i(TAG, person1Json);
    }
}
