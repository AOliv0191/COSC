public class PeerLeader extends Student{
    private int employeeID;
    private double salary;

    //default constructor:
    public PeerLeader(){
        super();//call default constructor from Student.java
        employeeID = 0;
        salary = 0.0;
    }

    //Customized constructor:
    public PeerLeader(String name, String major, int age, int id, int employeeID, double salary){
        super(name, major, age, id);
        this.employeeID = employeeID;
        this.salary = salary;
    }

    //Getters/Accesser
    public int getEmployeeID(){
        return this.employeeID;
    }

    public double getSalary(){
        return this.salary;
    }

    //Setter/Mutator
    public void setEmployeeID(int employeeID){
        this.employeeID = employeeID;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String toString(){
        return super.toString()+ " Employee ID: "
        + getEmployeeID() + ". Salary: " + getSalary() + ".";
    }
}