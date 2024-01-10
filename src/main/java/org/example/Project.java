package org.example;

public class Project {

    private String title;
    private String artist;
    private int numberOfMinutes;

    public Project(String title, String artist, int numberOfMinutes) {
        this.title = title;
        this.artist = artist;
        this.numberOfMinutes = numberOfMinutes;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getNumberOfMinutes() {
        return numberOfMinutes;
    }
}
