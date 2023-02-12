import org.example.Friend;
import org.example.Smartphone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FriendTest {
    @Test
    void testConstructor() {
        Friend f = new Friend("Edona",12345);
        Assertions.assertEquals( "Edona",f.getNameOfContact());
    }
    @Test
    void testToString() {
        Friend f=new Friend("Edona",12345);

        Assertions.assertEquals( "Friend={Edona,phoneNumber=12345}",f.toString());
}
}
