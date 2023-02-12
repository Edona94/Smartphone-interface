package org.example;

public class Contact {
    private String nameOfContact;

     public Contact(String nameOfContact) {
         this.nameOfContact = nameOfContact;
     }

     public String getNameOfContact() {
        return nameOfContact;
    }

    @Override
    public String toString() {
        return
                "nameOfContact='" + nameOfContact + '\'' ;

    }
}
