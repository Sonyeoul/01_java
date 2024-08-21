package main.java.question.Movie;

public class Movie {
    private String movieTitle;
    private String movieTime;
    private int total;
    private int reserve;

    public Movie() {
    }

    public Movie(String movieTitle, String movieTime, int total) {
        this.movieTitle = movieTitle;
        this.movieTime = movieTime;
        this.total = total;
        this.reserve = reserve;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getReserve() {
        return reserve;
    }

    public void setReserve(int reserve) {
        this.reserve = reserve;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieTitle='" + movieTitle + '\'' +
                ", movieTime='" + movieTime + '\'' +
                ", total=" + total +
                ", reserve=" + reserve +
                '}';
    }
}
