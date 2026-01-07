package day2;

public class Car {
    private String model;
    private String make;
    private int year;
    private double mileage;

    public Car(String model, String make, int year, double mileage){
        this.model = model;
        this.make = make;
        this.year = year;
        this.mileage = mileage;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public void displayCarDetails(){
        System.out.println(this);
    }

    public String toString(){
        return "Model: " + model + ", Make: " + make +
            ", Year: " + year + ", Mileage: " + mileage;
    }

    public void drive(double milesDriven){
        mileage += milesDriven;
        System.out.println("You drove + " + milesDriven + " miles.");
    }
}
