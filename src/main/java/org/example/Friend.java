package org.example;

public class Friend extends Contact {
    private int phoneNumber;


    public Friend(String nameOfContact,int phoneNumber) {
        super(nameOfContact);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend={" +getNameOfContact()+","+
                "phoneNumber=" + phoneNumber +
                '}';
    }
}
