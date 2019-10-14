package vk.com.dataprovider;

public class MovieDataProvider {


    private int movie_poster;
    private String movie_title;
    private String movie_rating;

    public MovieDataProvider(final int movie_poster, final String movie_title,
                             final String movie_rating) {
        this.movie_poster = movie_poster;
        this.movie_title = movie_title;
        this.movie_rating = movie_rating;
    }

    public int getMovie_poster() {
        return movie_poster;
    }

    public void setMovie_poster(final int movie_poster) {
        this.movie_poster = movie_poster;
    }

    public String getMovie_title() {
        return movie_title;
    }

    public void setMovie_title(final String movie_title) {
        this.movie_title = movie_title;
    }

    public String getMovie_rating() {
        return movie_rating;
    }

    public void setMovie_rating(final String movie_rating) {
        this.movie_rating = movie_rating;
    }
}
