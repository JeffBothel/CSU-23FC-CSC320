import java.util.regex.*;

public class Automobile {
    private int inIntYear = 0;
    private String inStrMake = null;
    private String inStrModel = null;
    private String inStrColor = null;
    private String inStrVIN = null;
    private float inFltMileage = 0;

    private void buildAutoAttributes(int year, String make, String model, String color, String vin, float mileage) {
        // Exception handling for activities that may fail during the build process or updating
        try{
            Pattern autoStrAttribute = Pattern.compile("[a-zA-Z0-9\\s-]+");
            Pattern autoStrVIN = Pattern.compile("[A-Z0-9]{17}");
            if(year != 0) {
                if(year > 1900 && year < 2100) this.inIntYear = year;
                else throw new Exception("Year is out of range.");
            }
            if(make != null) {
                Matcher autoStrAttributeMatcher = autoStrAttribute.matcher(make);
                if(autoStrAttributeMatcher.matches()) this.inStrMake = make;
                else throw new Exception("Make contains invalid characters.");
            }
            if(model != null) {
                Matcher autoStrAttributeMatcher = autoStrAttribute.matcher(model);
                if(autoStrAttributeMatcher.matches()) this.inStrModel = model;
                else throw new Exception("Model contains invalid characters.");
            }
            if(color != null) {
                Matcher autoStrAttributeMatcher = autoStrAttribute.matcher(color);
                if(autoStrAttributeMatcher.matches()) this.inStrColor = color;
                else throw new Exception("Color contains invalid characters.");
            }
            if(vin != null) {
                Matcher autoStrVINMatcher = autoStrVIN.matcher(vin);
                if(autoStrVINMatcher.matches()) this.inStrVIN = vin;
                else throw new Exception("VIN is invalid.");
            }
            if(mileage >= 0) this.inFltMileage = mileage;
            else throw new Exception("Mileage cannot be negative.");
        }
        catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Class constructors
    public Automobile() {
        this.buildAutoAttributes(0, null, null, null, null, 0);
    }
    public Automobile(int year, String make, String model) {
        this.buildAutoAttributes(year, make, model, null, null, 0);
    }
    public Automobile(int year, String make, String model, String color) {
        this.buildAutoAttributes(year, make, model, color, null, 0);
    }
    public Automobile(int year, String make, String model, String color, String vin) {
        this.buildAutoAttributes(year, make, model, color, vin, 0);
    }
    public Automobile(int year, String make, String model, String color, String vin, float mileage) {
        this.buildAutoAttributes(year, make, model, color, vin, mileage);
    }

    // Class update methods
    public void UpdateYear(int year) {
        this.buildAutoAttributes(year, this.inStrMake, this.inStrModel, this.inStrColor, this.inStrVIN, this.inFltMileage);
    }
    public void UpdateMake(String make) {
        this.buildAutoAttributes(this.inIntYear, make, this.inStrModel, this.inStrColor, this.inStrVIN, this.inFltMileage);
    }
    public void UpdateModel(String model) {
        this.buildAutoAttributes(this.inIntYear, this.inStrMake, model, this.inStrColor, this.inStrVIN, this.inFltMileage);
    }
    public void UpdateColor(String color) {
        this.buildAutoAttributes(this.inIntYear, this.inStrMake, this.inStrModel, color, this.inStrVIN, this.inFltMileage);
    }
    public void UpdateVIN(String vin) {
        this.buildAutoAttributes(this.inIntYear, this.inStrMake, this.inStrModel, this.inStrColor, vin, this.inFltMileage);
    }
    public void UpdateMileage(float mileage) {
        this.buildAutoAttributes(this.inIntYear, this.inStrMake, this.inStrModel, this.inStrColor, this.inStrVIN, mileage);
    }

    // Class accessors
    public String toString() {
        return this.inIntYear + " " + this.inStrMake + " " + this.inStrModel + " " + this.inStrColor + " " + this.inStrVIN + " " + this.inFltMileage;
    }
    public int GetYear() {
        return this.inIntYear;
    }
    public String GetMake() {
        return this.inStrMake;
    }
    public String GetModel() {
        return this.inStrModel;
    }
    public String GetColor() {
        return this.inStrColor;
    }
    public String GetVIN() {
        return this.inStrVIN;
    }
    public float GetMileage() {
        return this.inFltMileage;
    }
}