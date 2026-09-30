public class EmployeeTest {
    public static void main(String[] args){
        Employee first = new Employee();
        first.setName("Susan Meyers");
        first.setIdNumber(47899);
        first.setDepartment("Accounting");
        first.setPosition("Vice President");
        first.displayInfo();
        Employee second = new Employee("Mark Jones", 39119);
        second.setDepartment("IT");
        second.setPosition("Programmer");
        second.displayInfo();
        Employee third = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        third.displayInfo();
        System.out.println(first.getName());
    }
}
