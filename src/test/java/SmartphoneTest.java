import org.example.Contact;
import org.example.Friend;
import org.example.Smartphone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmartphoneTest {
    //SmartphoneTest smartphoneTest=new SmartphoneTest();

    @Test
    void testGetPosition(){
        Smartphone s= new Smartphone();
        String result = s.getPosition();
        Assertions.assertEquals("Köln",result);

    }
    @Test
    void testStartRadio(){
        Smartphone s= new Smartphone();
        boolean result = s.startRadio();
        Assertions.assertEquals(true,result);
    }
    @Test
    void testStopRadio(){
        Smartphone s= new Smartphone();
        boolean result = s.stopRadio();
        Assertions.assertEquals(false,result);
    }
    @Test
    void testContructor_empty() {
        Smartphone s= new Smartphone();
        Assertions.assertEquals(null, s.getNameOfModel());
    }
    @Test
    void testContructor() {
        List<Contact> allContacts= new ArrayList<>();
        allContacts.add(new Friend("Edona",12345));
        Smartphone s=new Smartphone("Iphone12","apple",allContacts);
        Assertions.assertEquals("Iphone12",s.getNameOfModel());
    }
    @Test
    void testToString() {
        List<Contact> allContacts= new ArrayList<>();
        allContacts.add(new Friend("Edona",12345));
        Smartphone s=new Smartphone("Iphone12","apple",allContacts);


        Assertions.assertEquals( "Smartphone{nameOfModel='Iphone12', maker='apple', allContacts=[Friend={Edona,phoneNumber=12345}]}",s.toString());
    }
}
