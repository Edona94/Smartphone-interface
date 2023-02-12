package org.example;

public class BusinessContact extends Contact {
    private String companyName;
    private String phoneNumber;

    public BusinessContact(String nameOfContact, String companyName, String phoneNumber) {
        super(nameOfContact);
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "BusinessContact{"+ " name" +getNameOfContact()+
                "companyName='" + companyName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
