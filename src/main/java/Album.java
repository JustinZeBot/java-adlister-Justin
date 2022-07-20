import java.io.Serializable;

public class Album implements Serializable {

    private long Id;
    private String name;
    private int release_date;
    private String artist;
    private double total_sales;
    private String genre;


    public Album(){

    }

    public long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public String getArtist() {
        return artist;
    }

    public double getTotal_sales() {
        return total_sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setId(long id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTotal_sales(double total_sales) {
        this.total_sales = total_sales;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
