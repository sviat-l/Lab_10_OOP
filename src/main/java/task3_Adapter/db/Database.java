package task3_Adapter.db;

public class Database extends БазаДаних {

    public String getUserData() {
        return super.отриматиДаніКористувача();
    }
    public String getStaticData() {
        return super.отриматиСтатистичніДані();
    }
}
