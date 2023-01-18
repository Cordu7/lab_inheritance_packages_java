import techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Bob", "1234567Q", 40_000.00);

    }

    @Test
    public void hasName(){
        assertEquals("Bob", databaseAdmin.getName());
    }
    @Test
    public void hasNi(){
        assertEquals("1234567Q", databaseAdmin.getNi());
    }
    @Test
    public void hasSalary(){
        assertEquals(40_000.00, databaseAdmin.getSalary(), 0.0);
    }


    @Test
    public void canIncreaseSalary(){
        databaseAdmin.raiseSalary(100.00);
        assertEquals(40_100.00, databaseAdmin.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){

        assertEquals(400.00, databaseAdmin.payBonus(), 0.0);
    }

}
