package quiz4a;

/**
 * คลาส Employee ใช้แทนข้อมูลของพนักงานมีรหัสพนักงาน ชื่อ เงินเดือน
 * คลาสนี้มีเมธอดไว้ดึงข้อมูลของพนักงานและคำนวณเงินเดือน
 */
public class Employee {

    private int employeeId;
    private String name;
    private double salary;

    /**
     * สร้างอ็อบเจ็ก Employee ด้วยรหัสพนักงาน ชื่อ เงินเดือน
     * ถ้าเงินเดือนมีค่าน้อยกว่าหรือเท่ากับ 0 จะตั้งค่าเป็น 0 แทน
     *
     * @param employeeId รหัสพนักงานที่ไม่ซ้ำกัน
     * @param name ชื่อพนักงาน
     * @param salary เงินเดือนของพนักงาน ต้องมากกว่า 0
     */
    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = (salary > 0) ? salary : 0;
    }

    /**
     * คำนวณเงินเดือนพนักงาน
     * 
     * @return เงินเดือนของพนักงาน
     */
    public double calculateSalary() {
        return salary;
    }

    /**
     * ดึงรหัสพนักงานที่ไม่ซ้ำ
     *
     * @return รหัสพนักงาน
     */
    public int getEmployeeId() {
        return employeeId;
    }

    /**
     * ดึงชื่อของพนักงาน
     *
     * @return ชื่อของพนักงาน
     */
    public String getName() {
        return name;
    }
}
