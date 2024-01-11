package org.example;

public class Project {

    private String title;
    private String artist;
    private int numberOfSongs;
    private int numberOfMinutes;

    public Project(String title, String artist, int numberOfSongs) {
        this.title = title;
        this.artist = artist;
        this.numberOfSongs = numberOfSongs;
    }
    public static Project createProject(String title, String artist, int numberOfSongs) {
        if (numberOfSongs >= 8) {
            return new Album(title, artist, numberOfSongs );
        } else {
            return new EP(title, artist, numberOfSongs);
        }
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

    public int getNumberOfSongs() {
        return numberOfSongs;
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
