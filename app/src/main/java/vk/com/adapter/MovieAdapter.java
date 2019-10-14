package vk.com.adapter;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import vk.com.dataprovider.MovieDataProvider;
import vk.com.listview_lesson12.R;

public class MovieAdapter extends ArrayAdapter {

    List movieList = new ArrayList();

    public MovieAdapter(@NonNull Context context, int resource) {
        super(context, resource);
    }

    static class DataHandler
    {
        ImageView poster;
        TextView title;
        TextView rating;
    }

    @Override
    public void add(@Nullable Object object) {
        movieList.add(object);
    }

    @Override
    public int getCount() {
        return this.movieList.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.movieList.get(position);
    }



    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View row;
        row = convertView;
        DataHandler handler;
        if(convertView==null)
        {
            LayoutInflater inflater = (LayoutInflater) this.getContext()
                                       .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.list_view_custom_layout, parent,false);
            handler = new DataHandler();
            handler.poster = row.findViewById(R.id.movie_poster);
            handler.title = row.findViewById(R.id.movie_title);
            handler.rating = row.findViewById(R.id.movie_rating);
            row.setTag(handler);

        }
        else
            {
                handler = (DataHandler) row.getTag();
            }

        MovieDataProvider dataProvider;
        dataProvider = (MovieDataProvider) this.getItem(position);
        handler.poster.setImageResource(dataProvider.getMovie_poster());
        handler.title.setText(dataProvider.getMovie_title());
        handler.rating.setText(dataProvider.getMovie_rating());

        return row;
    }
}
