package org.example;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements  Radio ,GPS {
    private String nameOfModel;
    private String maker;

   private List<Friend> allContacts =new ArrayList<>();
   public Smartphone(){

   }

    public Smartphone(String nameOfModel, String maker, List<Friend> allContacts) {
        this.nameOfModel = nameOfModel;
        this.maker = maker;
        this.allContacts = allContacts;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public List<Friend> getAllContacts() {
        return allContacts;
    }

    public void setAllContacts(List<Friend> allContacts) {
        this.allContacts = allContacts;
    }

    @Override
    public void getPosition() {
        System.out.println("Köln");

    }

    @Override
    public boolean startRadio() {
        System.out.println("Radio started");
        return true;
    }

    @Override
    public boolean stopRadio() {
        System.out.println("Radio stoped");
        return false;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "nameOfModel='" + nameOfModel + '\'' +
                ", maker='" + maker + '\'' +
                ", allContacts=" + allContacts +
                '}';
    }
}
