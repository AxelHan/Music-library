package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {

    private static int lastUserNumber;
    private String name;
    private int userNumber;
    private String favouriteGenre;
    private ArrayList<Project> favouriteProjects = new ArrayList<>();

    public User(String name, String favouriteGenre) {
        this.name = name;
        this.favouriteGenre = favouriteGenre;
        this.userNumber = ++ lastUserNumber;
    }

    protected void addProjectToFavourites(String title, String artist, int numberOfSongs){
        favouriteProjects.add(Project.createProject(title, artist, numberOfSongs));
    }

//    protected void removeProjectFromFavourites(String title, String artist, int numberOfSongs){
//        favouriteProjects.remove(new Project(title, artist, numberOfSongs));
//    }

    public String getName() {
        return this.name;
    }

    public int getUserNumber(){
        return this.userNumber;
    }
    public String getFavouriteGenre() {
        return this.favouriteGenre;
    }

    public ArrayList<Project> getFavouriteProjects() {
        return this.favouriteProjects;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", favouriteGenre='" + favouriteGenre + '\'' +
                ", userNumber='" + userNumber + '\'' +
                ", favouriteProjects=" + favouriteProjects.toString() +
                '}';
    }
}
