package toong.vn.androidgson.fromjson;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import toong.vn.androidgson.R;
import toong.vn.androidgson.model.Person;

public class JsonStringToJavaObjectActivity extends AppCompatActivity {
    private String TAG = getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jsonArrayToList();
    }

    private void jsonObjectToJavaObject() {
        String personJsonString = "{\"age\":1,\"gender\":\"male\",\"name\":\"A\"}";
        Person person = new Gson().fromJson(personJsonString, Person.class);
    }

    private void jsonArrayToList() {
        String personArray = "[{'name': '1','gender': 'Male'}, {'name': '2','gender': 'Male'}, {'name': '3','gender': 'Male'}]";
        List<Person> personList = getList(personArray, Person.class);
    }

    public <T> List<T> getList(String jsonArray, Class<T> clazz) {
        Type typeOfT = TypeToken.getParameterized(List.class, clazz).getType();
        return new Gson().fromJson(jsonArray, typeOfT);
    }
}
