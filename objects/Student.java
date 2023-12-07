public class Student{
    private String name;
    private String major;
    private int age;
    private int id;

    //Default constructor
    //Default constructor doesn't take any parameters
    public Student(){
        this.name = " ";
        this.major= " ";
        this.age = 0;
        this.id = 0;
    }

    //Customized constructor #1
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    //Customized constructor #2
    public Student(String name, String major, int age, int id ){
        this.name = name;
        this.major = major;
        this.age = age;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public String getMajor(){
        return this.major;
    }

    public int getAge(){
        return this.age;
    }

    public int getId(){
        return this.id;
    }

    //Setter/Mutator

    public void setName(String name){
        this.name = name;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void setAge(int age){
        this.age = age;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public String toString(){
        return "Student Name: " + getName() + ". Major: " + getMajor() +
        ". Age: " + getAge() + ". Id: " + getId() + ".";
    }
}