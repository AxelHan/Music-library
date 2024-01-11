package org.example;

import java.util.ArrayList;

public class Main {

    ArrayList<User> listOfUsers = new ArrayList<User>();

    public static void main (String[] args){

        //Create Users
        User user1 = new User("Axel", "Pop");
        User user2 = new User("Mårten", "Visor");

        //Add Projects
        user1.addProjectToFavourites("Whats the story (Morning glory)", "Oasis", "Rock", 12);
        user1.addProjectToFavourites("Känn ingen sorg för mig göteborg", "Håkan Hellström", "Pop", 10);
        user2.addProjectToFavourites("Ballader och oförskämdheter", "Cornelis Vreeswijk", "Ballads", 13);
        user2.addProjectToFavourites("TIAMAI", "Duvchi", "Mellow Pop", 5);


        //Print Users
        System.out.println(user1);
        System.out.println(user2);



        System.out.println(user1);


    }

}