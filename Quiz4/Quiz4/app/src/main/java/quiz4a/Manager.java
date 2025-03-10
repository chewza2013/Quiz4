package quiz4a;

/**
 * คลาส Manager เป็นคลาสที่สืบทอดจาก Employee ใช้แทนข้อมูลของผู้จัดการ
 */
public class Manager extends Employee {
    private String department;
    private double bonus;

    /**
     * สร้างอ็อบเจ็กต์ Manager ด้วยรหัสพนักงาน ชื่อ เงินเดือน แผนก โบนัส
     *
     * @param employeeId รหัสพนักงานที่ไม่ซ้ำ
     * @param name ชื่อพนักงาน
     * @param salary เงินเดือนพนักงาน
     * @param department แผนกที่ผู้จัดการดูแล
     * @param bonus โบนัสที่ผู้จัดการได้รับ
     */
    public Manager(int employeeId, String name, double salary, String department, double bonus) {
        super(employeeId, name, salary);
        this.department = department;
        this.bonus = bonus;
    }

    /**
     * รายละเอียดของผู้จัดการ
     */
    public void displayDetails() {
        String[] details = {
            "Employee ID: " + getEmployeeId(),
            "Name: " + getName(),
            "Salary: " + calculateSalary(),
            "Department: " + department,
            "Bonus: " + bonus
        };
        for (String detail : details) {
            System.out.println(detail);
        }
    }

    /**
     * รายละเอียดของผู้จัดการตามเงื่อนไข
     * ถ้าเงื่อนไขเป็น full จะโชว์ข้อมูลทั้งหมด
     * ถ้าเงื่อนไขเป็นอย่างอื่น จะโชว์เฉพาะรหัสพนักงานกับชื่อพนักงาน
     * 
     * @param condition เงื่อนไขในการแสดงรายละเอียด เช่น "full"
     */
    public void displayDetails(String condition) {
        if ("full".equalsIgnoreCase(condition)) {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName(),
                "Salary: " + calculateSalary(),
                "Department: " + department,
                "Bonus: " + bonus
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        } else {

            String[] details = {
                "Employee ID: " + getEmployeeId(),
                "Name: " + getName()
            };
            for (String detail : details) {
                System.out.println(detail);
            }
        }
    }

    /**
     * คำนวณโบนัส 20% ของเงินเดือน
     * @return เงินเดือน
     */
    public double calculateBonus() {
        return calculateSalary() * 0.2;
    }
}
