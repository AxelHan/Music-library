package org.example;

public class Project {

    private String title;
    private String artist;
    private String genre;
    private int numberOfSongs;
    private int numberOfMinutes;

    public Project(String title, String artist, String genre, int numberOfSongs) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.numberOfSongs = numberOfSongs;
    }
    public static Project createProject(String title, String artist, String genre, int numberOfSongs) {
        if (numberOfSongs >= 8) {
            return new Album(title, artist, genre, numberOfSongs );
        } else {
            return new EP(title, artist, genre, numberOfSongs);
        }
    }

    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getGenre() {
        return this.genre;
    }

    public int getNumberOfMinutes() {
        return this.numberOfMinutes;
    }

    public int getNumberOfSongs() {
        return this.numberOfSongs;
    }

    @Override
    public String toString() {
        return "Project{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", numberOfSongs=" + numberOfSongs +
                ", numberOfMinutes=" + numberOfMinutes +
                '}';
    }
}
