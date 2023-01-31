package org.example;

public abstract class Contact {
    private String nameOfContact;

    public Contact(String nameOfContact) {
        this.nameOfContact = nameOfContact;
    }

    public String getNameOfContact() {
        return nameOfContact;
    }

}
