package org.example;

import java.util.*;
import java.util.stream.Collectors;

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
        updateFavouriteGenre();
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

    protected void removeProjectFromFavourites(String title, String artist){

        for(Project project: favouriteProjects){
            if(project.getTitle().equalsIgnoreCase(title) && project.getArtist().equalsIgnoreCase(artist)){
                favouriteProjects.remove(project);
                System.out.println(title + "by: " + artist + " removed from favourites");
                break;
            }
        }
        System.out.println("There is no such project in the list");
        updateFavouriteGenre();

    }

//    protected void updateFavouriteGenre(){
//        Map.Entry<String, Long> result = favouriteProjects.stream()
//                .collect(Collectors.groupingBy(Project::getGenre, Collectors.counting()))
//                .entrySet().stream()
//                .collect(Collectors.maxBy(Map.Entry.comparingByValue()))
//                .orElse(null);
//
//        System.out.println(result.getKey());
//    }

    protected void updateFavouriteGenre(){

        Map.Entry<Long, List<String>> result = favouriteProjects.stream()
                .collect(Collectors.groupingBy(
                        p -> favouriteProjects.stream().filter(p1 -> p1.getGenre().equals(p.getGenre())).count(),
                        Collectors.mapping(Project::getGenre, Collectors.toList())
                ))
                .entrySet().stream()
                .max(Map.Entry.comparingByKey())
                .orElse(null);

        Set<String> uniqueGenres = new HashSet<>(result.getValue());
        this.favouriteGenre = String.join(" & ", uniqueGenres);

    }

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
