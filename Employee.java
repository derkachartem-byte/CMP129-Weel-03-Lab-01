public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;
    public Employee(String name, int idNumber, String department, String position){
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    public Employee(String name, int idNumber){
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }
    public Employee(){
        this.name = "";
        this.department = "";
        this.position = "";
        this.idNumber = 0;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public int getIdNumber(){
        return idNumber;
    }
    public void setIdNumber(int idNumber){
        this.idNumber = idNumber;
    }
    public void displayInfo(){
        System.out.println("----------------------");
        System.out.println("Name = " + name);
        System.out.println("IdNumber = " + Integer.toString(idNumber));
        System.out.println("Department = " + department);
        System.out.println("Position = " + position);
        System.out.println("----------------------");
    } 
}
