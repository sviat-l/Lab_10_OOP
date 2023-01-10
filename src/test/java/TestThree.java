import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task3_Adapter.db.*;

public class TestThree {
    @Test
    public void TestDBAdaptation(){

        Database db = new Database();

        Assertions.assertEquals(db.getUserData(), "hello");
        Assertions.assertEquals(db.getStaticData(), "hello2");

        Authorization authorization= new Authorization();
        Assertions.assertTrue(authorization.authorize(db));
        ReportBuilder br = new ReportBuilder(db);

        Assertions.assertEquals(br.getDb().getStaticData(), "hello2");
        Assertions.assertEquals(br.getDb().getUserData(), "hello");
    }

}
