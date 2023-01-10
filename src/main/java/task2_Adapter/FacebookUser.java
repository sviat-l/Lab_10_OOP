package task2_Adapter;

import lombok.AllArgsConstructor;
import lombok.Getter;
import task2_Adapter.Country;

import java.time.LocalDate;


@Getter
@AllArgsConstructor
public class FacebookUser {
    private String email;
    private Country userCountry;
    private LocalDate UserActiveTime;
}
