import java.util.Calendar;

public class Dollar {
    //Fields
    private int denomination;
    private String face;
    private String serial;
    private int year;

    //Constructors
    public Dollar(){
        this.denomination = 0;
        this.face = " ";
        this.serial= " ";
        this.year = 0;
    }

    public Dollar(int denomination, String face, String serial, int year){
        this.denomination = denomination;
        this.face = face;
        this.serial = serial;
        this.year = year;
    }

    public Dollar(int denomination, String serial, int year){
        this.denomination = denomination;
        this.serial = serial;
        this.year = year;
        switch (denomination) {
            case 1:
                this.face = "George Washington";
                break;
            case 2:
                this.face = "Thomas Jefferson";
                break;
            case 5:
                this.face = "Abraham Lincoln";
                break;
            case 10:
                this.face = "Alexander Hamilton";
                break;
            case 20:
                this.face = "Andrew Jackson";
                break;
            case 50:
                this.face = "Ulysses S. Grant";
                break;
            case 100:
                this.face = "Benjamin Franklin";
                break;
            default:
                break;
        }
    }
    public Dollar(int denomination, int year){
        this.denomination = denomination;
        this.year = year;
        switch (denomination) {
            case 1:
                this.face = "George Washington";
                break;
            case 2:
                this.face = "Thomas Jefferson";
                break;
            case 5:
                this.face = "Abraham Lincoln";
                break;
            case 10:
                this.face = "Alexander Hamilton";
                break;
            case 20:
                this.face = "Andrew Jackson";
                break;
            case 50:
                this.face = "Ulysses S. Grant";
                break;
            case 100:
                this.face = "Benjamin Franklin";
                break;
            default:
                break;
        }
    }

    //Methods (getters)
    public int getDenomination(){
        return this.denomination;
    }
    
    public String getFace(){
        return this.face;
    }

    public String getSerial(){
        return this.serial;
    }

    public int getYear(){
        return this.year;
    }

    private int getAge(int year){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        int age = currentYear - year;

        return age;
    }
    
    //Methods (setter)
    public void setDenomination(int denomination){
        this.denomination = denomination;
    }

    public void setFace(String face){
        this.face = face;
    }

    public void setSerial(String serial){
        this.serial = serial;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void showBill(){
        String msg = "$" + denomination + "Face: " + face +
        "Serial#: " + serial + " is " + getAge(year) + " years old.";

        System.out.println(msg);
    }
}
