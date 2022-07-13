package models;

import java.io.Serializable;

public class Album implements Serializable {

    private long id;
    private String artist;
    private String name;
    private double sales;
    private String genre;
    private Integer releaseDate;


    public Album() {
    }

    public Album(long id, String artist, String name, double sales, String genre, Integer releaseDate) {
        this.id = id;
        this.artist = artist;
        this.name = name;
        this.sales = sales;
        this.genre = genre;
        this.releaseDate = releaseDate;
    }

    public long getId() {
        return id;
    }

    public Album setId(long id) {
        this.id = id;
        return this;
    }

    public String getArtist() {
        return artist;
    }

    public Album setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public String getName() {
        return name;
    }

    public Album setName(String name) {
        this.name = name;
        return this;
    }

    public double getSales() {
        return sales;
    }

    public Album setSales(double sales) {
        this.sales = sales;
        return this;
    }

    public String getGenre() {
        return genre;
    }

    public Album setGenre(String genre) {
        this.genre = genre;
        return this;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public Album setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }
}

