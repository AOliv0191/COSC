public class Owls {
    private String familyType;
    private char gender;
    private String feathers;
    private double weight;
    private boolean nocturnalVision;

    //default constructor
    public Owls(){
        this.familyType = " ";
        this.gender = ' ';
        this.feathers = " ";
        this.weight = 0.0;
        this.nocturnalVision = false;
    }

    //customized constructor
    public Owls(String familyType){
        if(familyType.equalsIgnoreCase("Strigidae")){
            feathers = "large";
            nocturnalVision = true;
        }
        else if(familyType.equalsIgnoreCase("Tytonidae")){
            feathers = "small";
            nocturnalVision = false;
        }

    }

    //5 getters
    public String getFamilyType(){
        return this.familyType;
    }
    public char getGender(){
        return this.gender;
    }
    public String getFeathers(){
        return this.feathers;
    }
    public double getWeight(){
        return this.weight;
    }
    public boolean getNightVision(){
        return this.nocturnalVision;
    }

    //5 setter
    public void setFamilyType(String familyType){
        this.familyType = familyType;
    }
    public void setGender(char gender){
        this.gender = gender;
    }

    public void setFeathers(String feathers){
        this.feathers = feathers;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setNightVision(boolean nocturnalVision){
        this.nocturnalVision = nocturnalVision;
    }

    public String toString(){
        return "Family Type: " + getFamilyType() + ". Gender: " + getGender() 
        + ". Feathers size: " + getFeathers() + ". Weight: " + getWeight() 
        + " kg. Nocturnal vision?: " + getNightVision()+ ".";
    }

}
