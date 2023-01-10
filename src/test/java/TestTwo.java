import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task2_Adapter.*;

import java.time.LocalDate;

public class TestTwo {
    Client client1 = new FacebookClient(new FacebookUser("one@gmail.com", Country.Ukraine, LocalDate.now()));
    Client client2 = new TwitterClient(new TwitterUser("notone@gmail.com", "USA", "2022-12-30"));

    @Test
    public void TestClient(){
        Assertions.assertEquals(client1.getEmail(), "one@gmail.com");
        Assertions.assertEquals(client2.getLastActiveTime(), LocalDate.parse("2022-12-30"));
        Assertions.assertEquals(client1.getCountry(), "Ukraine");
        Assertions.assertEquals(client2.getCountry(), "USA");
    }

    @Test void TestLogin(){
        Client client_twitter = Login.login("twitter", "userMail@ucu.edu.ua", Country.Ukraine, "2022-12-12");
        Client client_facebook = Login.login("facebook", "noMail@ucu.edu.ua", Country.USA, "2020-01-01");

        Assertions.assertEquals(client_facebook.getCountry(), "USA");
        Assertions.assertEquals(client_twitter.getLastActiveTime().toString(), "2022-12-12");

        Assertions.assertThrows(IllegalArgumentException.class, ()->
                    Login.login("instagram", "unknown@ucu.edu", Country.Poland, "2012-07-07"));
    }

    @Test void TestSender(){
        MessageSender sender = new MessageSender();
        Assertions.assertEquals(sender.send("random text", client1, Country.Ukraine), "random text");
        Assertions.assertThrows(IllegalArgumentException.class, ()->sender.send("txt", client1, Country.USA));
        Assertions.assertThrows(IllegalArgumentException.class, ()->sender.send("txt", client2, Country.Ukraine));
    }

}
