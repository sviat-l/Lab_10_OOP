package task3_Adapter.db;

public class Main {
    public static void main(String[] args) {
        Database db = new Database();
        Authorization authorization= new Authorization();
        if (authorization.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
        }
    }
}
