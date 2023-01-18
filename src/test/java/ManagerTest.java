import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "1234567Q", 32_000.00, "Sales");

    }

    @Test
    public void hasName(){
        assertEquals("Bob", manager.getName());
    }
    @Test
    public void hasNi(){
        assertEquals("1234567Q", manager.getNi());
    }
    @Test
    public void hasSalary(){
        assertEquals(32_000.00, manager.getSalary(), 0.0);
    }
    @Test
    public void hasDepartment(){
        assertEquals("Sales", manager.getDepartmentName());
    }

    @Test
    public void canIncreaseSalary(){
        manager.raiseSalary(100.00);
        assertEquals(32_100.00, manager.getSalary(), 0.0);
    }
    @Test
    public void canPayBonus(){

        assertEquals(320.00, manager.payBonus(), 0.0);
    }

}
