import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task1_Singleton.User;

public class TestOne {

    @Test
    public void TestUser(){
        User user = new User("Sviat", "sviat@ucu.edu.ua", 1);
        Assertions.assertEquals(user.getName(), "Sviat");
        Assertions.assertEquals(user.getAge(), 1);
    }

    @Test
    public void TestDatabase(){
        User user = new User("Sviat", "sviat@ucu.edu.ua", 18);
        boolean valid = true;
        try {
            user.save();
        } catch (Exception e){
             valid = false;
        }
        Assertions.assertTrue(valid);
    }

}
