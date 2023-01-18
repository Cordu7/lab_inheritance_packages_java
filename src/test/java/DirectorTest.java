import management.Director;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Bob", "1234567Q", 32_000.00, "CEO", 100_000.00);

    }

    @Test
    public void hasName(){
        assertEquals("Bob", director.getName());
    }
    @Test
    public void hasNi(){
        assertEquals("1234567Q", director.getNi());
    }
    @Test
    public void hasSalary(){
        assertEquals(32_000.00, director.getSalary(), 0.0);
    }
    @Test
    public void hasDepartment(){
        assertEquals("CEO", director.getDepartmentName());
    }

    @Test
    public void canIncreaseSalary(){
        director.raiseSalary(100.00);
        assertEquals(32_100.00, director.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){

        assertEquals(640.00, director.payBonus(), 0.0);
    }

    @Test
    public void hasBudget(){
        assertEquals(100_000.00, director.getBudget(), 0.0);
    }
}


