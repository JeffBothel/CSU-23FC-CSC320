# CSC320 Portfolio Program
This is the final project for the course CSC320 - Programming I held by CSU Global during their 2023 Fall C term. For this project, the following prompt was given for the project.

*Create an automobile class that will be used by a dealership as a vehicle inventory program. The following attributes should be present in your automobile class:*
* *private string make*
* *private string model*
* *private string color*
* *private int year*
* *private int mileage*

*Your program should have appropriate methods such as:*
* *default constructor*
* *parameterized constructor*
* *add a new vehicle method*
* *list vehicle information (return string array)*
* *remove a vehicle method*
* *update vehicle attributes method*

*All methods should include try..catch constructs. Except as noted all methods should return a success or failure message (failure message defined in "catch").*
1. *Create an additional class to call your automobile class (e.g., Main or AutomobileInventory). Include a try..catch construct and print it to the console.*
2. *Call automobile class with parameterized constructor (e.g., "make, model, color, year, mileage").*
    * *Then call the method to list the values. Loop through the array and print to the screen.*
3. *Call the remove vehicle method to clear the variables.*
    * *Print the return value.*
4. *Add a new vehicle.*
    * *Print the return value.*
    * *Call the list method and print the new vehicle information to the screen.*
5. *Update the vehicle.*
    * *Print the return value.*
    * *Call the listing method and print the information to the screen.*
6. *Display a message asking if the user wants to print the information to a file (Y or N).*
    * *Use a scanner to capture the response. If "Y", print the file to a predefined location (e.g., C:\Temp\Autos.txt). Note: you may want to create a method to print the information in the main class.*
    * *If "N", indicate that a file will not be printed.*

## Requirements Analysis and Tracking
Given the above prompt provided, the following requirements need to make it into the final program.\
:white_square_button: = Needed\
:white_check_mark: = Added\
:heavy_exclamation_mark: = Problems

* :white_square_button: :white_square_button: Create a class for tracking vehicles in an dealership inventory
    * :white_check_mark: :white_square_button: Make of vehicle
    * :white_check_mark: :white_square_button: Model of vehicle
    * :white_check_mark: :white_square_button: Year of vehicle
    * :white_check_mark: :white_square_button: Color of vehicle
    * :white_check_mark: :white_square_button: Mileage of vehicle
    * :white_check_mark: :white_square_button: VIN for the vehicle
    * :white_check_mark: :white_square_button: Default constructor for the class
    * :white_check_mark: :white_square_button: Parameterized constructors for the vehicle class
    * :white_check_mark: :white_square_button: Include try and catch components to the class
    * :white_check_mark: :white_square_button: Methods to update vehicle
    * :white_check_mark: :white_square_button: Methods to display vehicle info
* :white_square_button: :white_square_button: Create a class that allows the management of the vehicle lists
    * :white_square_button: :white_square_button: Methods to add vehicles to the list
    * :white_square_button: :white_square_button: Methods to update a vehicle
    * :white_square_button: :white_square_button: Methods to remove a vehicle
    * :white_square_button: :white_square_button: Methods to list a vehicle
    * :white_square_button: :white_square_button: Include try and catch components to the class
* :white_square_button: :white_square_button: Create a user interface for the program
    * :white_square_button: :white_square_button: Create unit testing for the classes

## Pseudocode for the various components
The following are the various pseudocode components for the program

### Automobile Class
```
class Automobile
    private inIntYear
    private inStringMake
    private inStringModel
    private inStringColor
    private inStringVIN
    private inFloatMileage

    private void buildAutoAttributes(int year, String make, String model, String color, String vin, float mileage)
        try
            if(year != null)
                if(year == regex(\d{4}) and year > 1890 and year < 2100) this.inInYear = year
                else throw exception "year is not valid"
            else this.inIntYear = null
            if(make != null)
                if(make == regex([a-zA-Z0-9-\s]+)) this.inStringMake = make
                else throw exception "make not valid"
            else inStringMake = null
            if(model != null)
                if(make == regex([a-zA-Z0-9-\s]+)) this.inStringModel = model
                else throw exception "model not valid"
            else inStringMake = null
            if(color != null)
                if(color == regex([a-zA-Z0-9-\s]+)) this.inStringColor = color
                else throw exception "color not valid"
            else inStringMake = null
            if(vin != null)
                if(vin == regex([a-zA-Z0-9-\s]+)) this.inStringVIN = vin
                else throw exception "VIN not valid"
            else inStringMake = null
            if(mileage != null)
                if(mileage == regex(\d*) and mileage >= 0) this.inFloatMileage = mileage
                else throw exception "mileage not valid"
            else inFloatMileage = null


    public Automobile()
        buildAutoAttributes(null, null, null, null, null, null)
    public Automobile(int year, String make, String model)
        buildAutoAttributes(year, make, model, null, null, null)
    public Automobile(int year, String make, String model, String color)
        buildAutoAttributes(year, make, model, color, null, null)
    public Automobile(int year, String make, String model, String color, String vin)
        buildAutoAttributes(year, make, model, color, vin, null)
    public Automobile(int year, String make, String model, String color, String vin, float mileage)
        buildAutoAttributes(year, make, model, color, vin, mileage)

    public UpdateYear(int year)
        buildAutoAttributes(year, this.inStringMake, this.inStringModel, this.inStringColor, this.inStringVIN, this.inFloatMileage)
    public UpdateMake(String make)
        buildAutoAttributes(this.inIntYear, make, this.inStringModel, this.inStringColor, this.inStringVIN, this.inFloatMileage)
    public UpdateModel(String model)
        buildAutoAttributes(this.inIntYear, this.inStringMake, model, this.inStringColor, this.inStringVIN, this.inFloatMileage)
    public UpdateColor(String color)
        buildAutoAttributes(this.inIntYear, this.inStringMake, this.inStringModel, color, this.inStringVIN, this.inFloatMileage)
    public UpdateVIN(String vin)
        buildAutoAttributes(this.inIntYear, this.inStringMake, this.inStringModel, this.inStringColor, vin, this.inFloatMileage)
    public UpdateMileage(float mileage)
        buildAutoAttributes(this.inIntYear, this.inStringMake, this.inStringModel, this.inStringColor, this.inStringVIN, mileage)

    public String toString()
        return string with this.inIntYear, this.inStringMake, this.inStringModel, this.inStringColor, this.inStringVIN, this.inFloatMileage
    public String GetYear()
        return this.intInYear
    public String GetMake()
        return this.inStringMake
    public String GetModel()
        return this.inStringModel
    public String GetColor()
        return this.inStringColor
    public String GetVIN()
        return this.inStringVIN
    public float GetMileage()
        return this.inFloatMileage

```
* Added in the VIN item as a unique identifier for the vehicles

### AutoInventory Class
```
class AutoInventory
    private queue<Automobile> inventoryQueue

    public AutoInventory()
    public AutoInventory(Automobile inAuto)
        this.inventoryQueue.add(inAuto)
    public AutoInventory(Automobile[] inArray)
        for(inAuto in inArray)
            this.inventoryQueue.add(inAuto)
    public AutoInventory(AutoInventory inAutoInventory)
        for(inAuto in inAutoInventory.inventoryQueue)
            this.inventoryQueue.add(inAuto)
    
    public void AddAuto(Automobile inAuto)
        this.inventoryQueue.add(inAuto)

    public void RemoveAuto(int index)
        this.inventoryQueue.remove(index)

    public void UpdateAuto(int index, Automobile inAuto)
        this.inventoryQueue[index] = inAuto

    public Automobile GetAuto(int index)
        return this.inventoryQueue[index]
```
* Chose to use the Queue type of listing management to  track the vehicles in the FIFO method for sales

### AutoMgmt Class
```
class AutoMgmt
    method main
    method TestAutomobile
        Automobile goodAutoDef0 = correct auto defintion
        Automobile goodAutoDef1 = correct auto defintion
        Automobile goodAutoDef2 = correct auto defintion
        Automobile goodAutoDef3 = correct auto defintion
        Automobile badAutoDef0 = bad auto definition
        Automobile badAutoDef1 = bad auto definition
        Automobile badAutoDef2 = bad auto definition
        Automobile badAutoDef3 = bad auto definition
    
    method TestAutoInventory
        AutoInventory testAutoInventory
        testAutoInventory.AddAuto(goodAutoDef0)
        testAutoInventory.AddAuto(goodAutoDef1)
        testAutoInventory.AddAuto(goodAutoDef2)
        testAutoInventory.AddAuto(goodAutoDef3)
        testAutoInventory.AddAuto(Automobile(year, make, model, color, vin, mileage))
```