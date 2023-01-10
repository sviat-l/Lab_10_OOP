package task2_Adapter;

import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
public class MessageSender {
    private static final MessageSender messageSender = new MessageSender();

    public String send(String text,Client user, Country country){
        if (country == Country.Ukraine && !user.getLastActiveTime().isBefore(LocalDate.now())){
            return text;
        }
        throw new IllegalArgumentException("Opps... Invalid User");
    }
}
