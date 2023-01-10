package task3_Adapter.db;
public class Authorization extends Авторизація {

    public boolean authorize(Database db) {
        return super.авторизуватися(db);
    }
}
