package task1_Singleton;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.SQLException;

@Getter
@AllArgsConstructor
public class User{

    private String name;
    private String email;
    private int age;

    public void save() throws SQLException {
        DataBase database = DataBase.getInstance();
        String dbQuery = "INSERT INTO user (email, name, age) VALUES ('"
                                            +email+"', '"+name+"', "+age+");";
        database.dbPostQuery(dbQuery);
    }
}
