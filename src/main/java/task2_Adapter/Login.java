package task2_Adapter;

import java.time.LocalDate;

public class Login {

    public static Client login(String loginMethod, String userMail, Country country, String date){
        if(loginMethod.equals("twitter")){
            return new TwitterClient(
                    new TwitterUser(userMail, country.toString(), date));
        }
        if(loginMethod.equals("facebook")){
            return new FacebookClient(
                    new FacebookUser(userMail, country, LocalDate.parse(date)));
        }
        throw new IllegalArgumentException("Invalid login Method");
    }
}
