package org.example;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements  Radio ,GPS {
    private String nameOfModel;
    private String maker;

   private List<Contact> allContacts ;
   public Smartphone(){

   }

    public Smartphone(String nameOfModel, String maker, List<Contact> allContacts) {
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

    public List<Contact> getAllContacts() {
        return allContacts;
    }

    public void setAllContacts(List<Contact> allContacts) {
        this.allContacts = allContacts;
    }

    @Override
    public String getPosition() {
        return "Köln";
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

    public void addContact(Contact contact){
        allContacts.add(contact);
    }

    public Contact getContact(int i){
       return allContacts.get(i);
    }
    public Contact getContactByName(String contactname) {
        for (Contact c : allContacts) {
            if (c.getNameOfContact().equals(contactname)) {
                return c;
            }
        }
        return null;
   }
   public Contact removeContactByName(String contactname){
       for(Contact c:allContacts){
           if(c.getNameOfContact().equals(contactname)){
               allContacts.remove(c);
               return c;
           }
       }
       return null;
   }
}
