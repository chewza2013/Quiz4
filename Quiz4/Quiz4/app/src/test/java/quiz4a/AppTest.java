package quiz4a;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void createEmployee() {
        Employee employee = new Employee(1, "John Doe", 50000);
        
        assertEquals(50000, employee.calculateSalary(), "เงินเดือนต้องเป็น 50000");
    }

    @Test
    void SalaryCannotBeNegative() {
        Employee employee = new Employee(2, "Jane Doe", -10000);
        
        assertEquals(0, employee.calculateSalary(), "เงินเดือนต้องตั้งเป็นค่าติดลบไม่ได้");
    }

    @Test
    void Bonus20() {
        Manager manager = new Manager(3, "Mary Manager", 50000, "HR", 0);
        
        double expectedBonus = 50000 * 0.2;
        
        assertEquals(expectedBonus, manager.calculateBonus(), "โบนัส 20% ของเงินเดือน");
    }
}
 