import techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bob", "1234567Q", 40_000.00);

    }

    @Test
    public void hasName(){
        assertEquals("Bob", developer.getName());
    }
    @Test
    public void hasNi(){
        assertEquals("1234567Q", developer.getNi());
    }
    @Test
    public void hasSalary(){
        assertEquals(40_000.00, developer.getSalary(), 0.0);
    }


    @Test
    public void canIncreaseSalary(){
        developer.raiseSalary(100.00);
        assertEquals(40_100.00, developer.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){

        assertEquals(400.00, developer.payBonus(), 0.0);
    }

    @Test
    public void canChangeName(){
        developer.setName("Pat");
        assertEquals("Pat", developer.getName());
    }

    @Test
    public void cannotChangeNameIfNull(){
        developer.setName(null);
        assertEquals("Bob", developer.getName());
    }




}