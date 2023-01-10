package task3_Adapter.db;

import lombok.Getter;

@Getter
public class ReportBuilder {
    private Database db;
    public ReportBuilder(Database db) {
        this.db = db;
    }

}
