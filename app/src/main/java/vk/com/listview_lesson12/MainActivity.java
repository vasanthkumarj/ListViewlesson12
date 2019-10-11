package vk.com.listview_lesson12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayAdapter<String> adapter;
    //private ArrayAdapter<CharSequence> arrayAdapter;
    private String[] version_list = {"Kitkat","Lolipop","Marshmellow","Oreo","Nougat","Pie"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        listView = findViewById(R.id.movie_list);
//        //arrayAdapter = ArrayAdapter.createFromResource(this, R.array.version_list, android.R.layout.simple_list_item_1);
//        //adapter = new ArrayAdapter<>(this, R.layout.list_view_custom_layout, R.id.list_view, version_list);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getBaseContext(), String.valueOf(adapterView.getItemAtPosition(i)), Toast.LENGTH_LONG).show();
//                view.setSelected(true);
//            }
//        });


    }
}
