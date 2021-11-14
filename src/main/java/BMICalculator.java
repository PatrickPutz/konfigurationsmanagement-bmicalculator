/*

Name: Patrick Putz
Email: s50822@edu.campus02.at
Matrikel-Number: 52101627


 */



public class BMICalculator {

    private String firstname;
    private String lastname;
    private char gender;
    private int bodyHeight;
    private double bodyWeight;

    // Constructor
    public BMICalculator(String firstname, String lastname, char gender, int bodyHeight, double bodyWeight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.gender = gender;
        this.bodyHeight = bodyHeight;
        this.bodyWeight = bodyWeight;
    }

    // Getter & Setter Methods

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public char getGender() {
        return gender;
    }

    public int getBodyHeight() {
        return bodyHeight;
    }

    public double getBodyWeight() {
        return bodyWeight;
    }

    public void setBodyHeight(int bodyHeight) {
        this.bodyHeight = bodyHeight;
    }

    public void setBodyWeight(double bodyWeight) {
        this.bodyWeight = bodyWeight;
    }



    private double round(double value) {
        return Math.round(value * 100) / 100D;
    }

    public double calculateBMI() {
        // This method calculates the bmi double value of a person
        return round(this.bodyWeight / (((double) this.bodyHeight / 100) * ((double) this.bodyHeight / 100)));
    }

    public int calculateBMICategory() {
        // This method calculates the integer value of the bmi category
        if(this.gender == 'm'){
            if(this.calculateBMI() < 16.0)
                return -2;
            else if (this.calculateBMI() < 18.5)
                return -1;
            else if (this.calculateBMI() < 25.0)
                return 0;
            else if (this.calculateBMI() < 35)
                return 1;
            else if (this.calculateBMI() >= 35.0)
                return 2;
        }

        if(this.gender == 'f'){
            if(this.calculateBMI() < 15.0)
                return -2;
            else if (this.calculateBMI() < 17.5)
                return -1;
            else if (this.calculateBMI() < 24.0)
                return 0;
            else if (this.calculateBMI() < 34)
                return 1;
            else if (this.calculateBMI() >= 34.0)
                return 2;
        }

        return 3;
    }

    public String getBMICategoryName() {
        // This method provides the definition of the bmi category
        switch(this.calculateBMICategory()){
            case -2:
                return "Sehr starkes Untergewicht";
            case -1:
                return "Untergewicht";
            case 0:
                return "Normalgewicht";
            case 1:
                return "Übergewicht";
            case 2:
                return "Sehr starkes Übergewicht";
            case 3:
                return "Error in: calculateBMICategory";
            default:
                return "Error in: getBMICategoryName";
        }
    }

}
