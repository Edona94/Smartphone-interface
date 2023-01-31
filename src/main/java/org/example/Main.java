package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     Friend friend1= new Friend("Edona",123456);
        System.out.println(friend1);
        Friend friend2= new Friend("Daniel",123543);
        System.out.println(friend2);
        List<Friend> friends= new ArrayList<>();
        friends.add(friend1);
        friends.add(friend2);
        System.out.println(friends);
        Smartphone smartphone=new Smartphone("Iphone12","apple",friends);
        System.out.println(smartphone);
        smartphone.startRadio();
        smartphone.stopRadio();
        smartphone.getPosition();

    }
}