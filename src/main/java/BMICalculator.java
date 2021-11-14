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
        // TODO: Your implementation
        return 0;
    }

    public String getBMICategoryName() {
        // TODO: Your implementation
        return "";
    }

}
