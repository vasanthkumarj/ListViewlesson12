package vk.com.listview_lesson12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import vk.com.adapter.MovieAdapter;
import vk.com.dataprovider.MovieDataProvider;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private int[] moviePosterResource = {R.mipmap.bigil, R.mipmap.comali, R.mipmap.ethir,
                                           R.mipmap.imk, R.mipmap.kabali, R.mipmap.kvendam,
                                           R.mipmap.lucifer, R.mipmap.manithan, R.mipmap.monster,
                                           R.mipmap.ngk};
    private String[] movieTitles;
    private String[] movieRatings;
    private MovieAdapter adapter;
    //private ArrayAdapter<String> adapter;
    //private ArrayAdapter<CharSequence> arrayAdapter;
    //private String[] version_list = {"Kitkat","Lolipop","Marshmellow","Oreo","Nougat","Pie"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.movie_list);
        movieTitles = getResources().getStringArray(R.array.movie_titles);
        movieRatings = getResources().getStringArray(R.array.movie_ratings);
        int counter=0;
        adapter = new MovieAdapter(getApplicationContext(), R.layout.list_view_custom_layout);
        listView.setAdapter(adapter);
        for(int poster:moviePosterResource)
        {
            MovieDataProvider movieDataProvider = new MovieDataProvider(poster, movieTitles[counter],
                                                      movieRatings[counter]);
            adapter.add(movieDataProvider);
            counter=counter+1;
        }
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
