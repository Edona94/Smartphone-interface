package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Contact contact1= new Contact("Edona K") ;
        Contact contact2= new Contact("Egzona K") ;
        Contact contact3= new Contact("Ermir K") ;
         List<Contact> allContacts= new ArrayList<>();
         allContacts.add(contact1);
         allContacts.add(contact2);
        System.out.println(allContacts);


     Smartphone smartphone=new Smartphone("IPhone12","Apple",allContacts);
        System.out.println(smartphone);
        smartphone.addContact(contact3);
        System.out.println("---Contact added----");
        System.out.println(smartphone);
        System.out.println("Contact fing by id  "+smartphone.getContact(1));
        System.out.println("Contact find by name  "+smartphone.getContactByName("Edona K"));
        System.out.println("Contact removed  "+smartphone.removeContactByName("Edona K"));

        smartphone.startRadio();
        smartphone.stopRadio();
        System.out.println( smartphone.getPosition());

    }
}
/**Friend friend1= new Friend("Edona",123456);
 System.out.println(friend1);
 Friend friend2= new Friend("Daniel",123543);
 System.out.println(friend2);
 List<Friend> friends= new ArrayList<>();
 friends.add(friend1);
 friends.add(friend2);
 System.out.println(friends);

 Smartphone smartphone=new Smartphone("Iphone12","apple",friends);
 System.out.println(smartphone);
 **/