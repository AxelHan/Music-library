package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class User {

    private static int lastUserNumber;
    private String name;
    private int userNumber;
    private String favouriteGenre;
    private ArrayList<Project> favouriteProjects = new ArrayList<>();
    private Scanner sc;

    public User(String name, String favouriteGenre) {
        this.name = name;
        this.favouriteGenre = favouriteGenre;
        this.userNumber = ++ lastUserNumber;
        this.sc = new Scanner(System.in);
    }

    protected void addProjectToFavourites(String title, String artist, String genre, int numberOfSongs){
        favouriteProjects.add(Project.createProject(title, artist, genre, numberOfSongs));
    }
    protected void addProjectInteractivelyToFavourites(){

        System.out.println("What is the title of the project?");

        String title = sc.nextLine();

        System.out.println("What is the name of the artist?");

        String artist = sc.nextLine();

        System.out.println("What genre is the project?");

        String genre = sc.nextLine();

        System.out.println("How many songs does the project consist of?");

        int numberOfSongs = sc.nextInt();

        favouriteProjects.add(Project.createProject(title, artist, genre, numberOfSongs));
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
        String user = "";
        user += "Name: " + this.name + "\n";
        user += " User Number: " + this.userNumber + "\n";
        user += " Favourite genre: " + this.favouriteGenre + "\n";
        user +=  name + "s favourite projects are: ";
        for (Project proj : this.favouriteProjects){
            user += "The " +
                    proj.getGenre() + " " +
                    proj.getClass().getSimpleName().toLowerCase() + " " +
                    proj.getTitle() + " by: " +
                    proj.getArtist() + ", \n";
        }

        return user;
    }
}
