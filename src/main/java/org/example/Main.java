package org.example;

import java.util.ArrayList;

public class Main {

    ArrayList<User> listOfUsers = new ArrayList<User>();

    public static void main (String[] args){
        User user1 = new User("Axel", "Pop");
        User user2 = new User("Mårten", "Visor");
        user1.addProjectToFavourites("Whats the story (Morning glory)", "Oasis", 12);
        user1.addProjectToFavourites("Känn ingen sorg för mig göteborg", "Håkan Hellström", 10);
        user2.addProjectToFavourites("Ballader och oförskämdheter", "Cornelis Vreeswijk", 13);


        System.out.println(user1);
        System.out.println(user2);

    }

}