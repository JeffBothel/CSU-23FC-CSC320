import java.util.Scanner;
import java.io.*;

public class AutoMgmt {
    // Main entry point for the program
    public static void main(String[] args) {
        // Definition of the variables used in the program
        AutoInventory mainInventory = new AutoInventory();
        String userInput = "";
        Scanner inputScanner = new Scanner(System.in);
        String[] userInputArr = new String[20];
        
        // Program introduction to the user
        System.out.println("CSC320 - Portfolio Project - Automobile Management System");
        System.out.println("By: Jeff Bothel");
        
        while(true) {
            System.out.println("Command: ");
            userInput = inputScanner.nextLine();
            userInputArr = userInput.split(" ");
            switch(userInputArr[0]) {
                case "test":
                    switch(userInputArr[1]) {
                        case "auto":
                            TestAutomobile();
                            continue;
                        case "inventory":
                            TestAutoInventory();
                            continue;
                        default:
                            System.out.println("Invalid input. Please try again.");
                            continue;
                    }
                case "add":
                    switch(userInputArr[1]) {
                        case "auto":
                        case "automobile":
                        case "car":
                        case "suv":
                        case "truck":
                        case "van":
                            mainInventory.AddAuto(Integer.parseInt(userInputArr[2]), userInputArr[3], userInputArr[4], userInputArr[5], userInputArr[6], Float.parseFloat(userInputArr[7]));
                            continue;
                    }
                    continue;
                case "list":
                case "display":
                    switch(userInputArr[1]) {
                        case "all":
                            System.out.println(mainInventory.toString());
                            System.out.println("\nTotal vehicles: " + mainInventory.GetInventory().length);
                            System.out.println("Do you want to export the inventory to a file? (y/n): ");
                            userInput = inputScanner.nextLine();
                            userInputArr = userInput.split(" ");
                            switch(userInputArr[0]){
                                case "y":
                                case "yes":
                                    System.out.println("Exporting inventory to file...");
                                    try {
                                        FileWriter fileWriter = new FileWriter("inventory.txt");
                                        PrintWriter printWriter = new PrintWriter(fileWriter);
                                        printWriter.print(mainInventory.toString() + "\nTotal vehicles: " + mainInventory.GetInventory().length);
                                        printWriter.close();
                                    } catch (IOException e) {
                                        System.out.println("Error: " + e.getMessage());
                                    }
                                    continue;
                                case "n":
                                case "no":
                                    System.out.println("Not exporting inventory to file.");
                                    continue;
                                default:
                                    System.out.println("Invalid input. Not exporting inventory to file.");
                                    continue;
                            }
                        default:
                            System.out.println(mainInventory.GetAuto(Integer.parseInt(userInputArr[1])).toString());
                            continue;
                    }
                case "remove":
                    mainInventory.RemoveAuto(Integer.parseInt(userInputArr[1]));
                    continue;
                case "update":
                case "change":
                    switch(userInputArr[2]) {
                        case "whole":
                            mainInventory.GetAuto(Integer.parseInt(userInputArr[1])).UpdateYear(Integer.parseInt(userInputArr[3]));
                            mainInventory.GetAuto(Integer.parseInt(userInputArr[1])).UpdateMake(userInputArr[4]);
                            mainInventory.GetAuto(Integer.parseInt(userInputArr[1])).UpdateModel(userInputArr[5]);
                            mainInventory.GetAuto(Integer.parseInt(userInputArr[1])).UpdateColor(userInputArr[6]);
                            mainInventory.GetAuto(Integer.parseInt(userInputArr[1])).UpdateVIN(userInputArr[7]);
                            mainInventory.GetAuto(Integer.parseInt(userInputArr[1])).UpdateMileage(Float.parseFloat(userInputArr[8]));
                            continue;
                        case "year":
                            mainInventory.GetAuto(Integer.parseInt(userInputArr[2])).UpdateYear(Integer.parseInt(userInputArr[3]));
                            continue;
                        case "make":
                            mainInventory.GetAuto(Integer.parseInt(userInputArr[2])).UpdateMake(userInputArr[3]);
                            continue;
                        case "model":
                            mainInventory.GetAuto(Integer.parseInt(userInputArr[2])).UpdateModel(userInputArr[3]);
                            continue;
                        case "color":
                            mainInventory.GetAuto(Integer.parseInt(userInputArr[2])).UpdateColor(userInputArr[3]);
                            continue;
                        case "vin":
                            mainInventory.GetAuto(Integer.parseInt(userInputArr[2])).UpdateVIN(userInputArr[3]);
                            continue;
                        case "mileage":
                            mainInventory.GetAuto(Integer.parseInt(userInputArr[2])).UpdateMileage(Float.parseFloat(userInputArr[3]));
                            continue;
                        default:
                            System.out.println("Invalid input. Please try again.");
                            continue;
                    }
                case "done":
                case "end":
                case "exit":
                    System.out.println("Exiting program.");
                    inputScanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid input. Please try again.");
                    continue;
            }
        }
    }

    // Test method for the automobile class
    public static void TestAutomobile() {
        // Defining automobile objects for testing
        Automobile goodAuto1 = new Automobile(2022, "Ford", "Mustang", "Red", "1FATP8UH3M5111111", 0);
        Automobile goodAuto2 = new Automobile(2021, "Ford", "Mustang", "Blue", "1FATP8UH3M5222222", 0);
        Automobile goodAuto3 = new Automobile(2020, "Ford", "Mustang", "Green", "1FATP8UH3M5333333", 0);
        Automobile goodAuto4 = new Automobile(2019, "Ford", "Mustang", "Yellow", "1FATP8UH3M5444444", 0);
        Automobile badAuto1 = new Automobile(201, "Ford", "Mustang", "Orange", "1FATP8UH3M5555555", 0);
        Automobile badAuto2 = new Automobile(2017, "Ford!", "Mustang", "Purple", "1FATP8UH3M5666666", 0);
        Automobile badAuto3 = new Automobile(2016, "Ford", "Mustang", "Black", "1FATP8UH3M5777", 0);
        Automobile badAuto4 = new Automobile(2015, "Ford", "Mustang", "White", "1FATP8UH3M5888888", -100);

        // Testing the accessor methods
        System.out.println("Testing the toString() method:");
        System.out.println(goodAuto1.toString());
        System.out.println(goodAuto2.GetYear());
        System.out.println(goodAuto3.GetMake());
        System.out.println(goodAuto4.GetModel());
        System.out.println(goodAuto1.GetColor());
        System.out.println(goodAuto2.GetVIN());
        System.out.println(goodAuto3.GetMileage());

        // Testing the update methods
        System.out.println("Testing the update methods:");
        goodAuto1.UpdateYear(2023);
        goodAuto2.UpdateMake("Chevrolet");
        goodAuto3.UpdateModel("Camaro");
        goodAuto4.UpdateColor("Black");
        goodAuto1.UpdateVIN("1G1YY32G135111111");
        goodAuto2.UpdateMileage(100);
        System.out.println(goodAuto1.toString());
    }

    // Test method for the auto inventory class
    public static void TestAutoInventory() {
        Automobile goodAuto1 = new Automobile(2022, "Ford", "Mustang", "Red", "1FATP8UH3M5111111", 0);
        Automobile goodAuto2 = new Automobile(2021, "Ford", "Mustang", "Blue", "1FATP8UH3M5222222", 0);
        Automobile goodAuto3 = new Automobile(2020, "Ford", "Mustang", "Green", "1FATP8UH3M5333333", 0);
        Automobile goodAuto4 = new Automobile(2019, "Ford", "Mustang", "Yellow", "1FATP8UH3M5444444", 0);        

        // Defining AutoInventory objects for testing
        AutoInventory goodInventory1 = new AutoInventory();
        AutoInventory goodInventory2 = new AutoInventory(goodAuto1);
        AutoInventory goodInventory3 = new AutoInventory(new Automobile[] {goodAuto1, goodAuto2, goodAuto3, goodAuto4});
        AutoInventory goodInventory4 = new AutoInventory(goodInventory3.GetInventory());

        // Testing the accessor methods
        System.out.println("Testing the toString() method:");
        System.out.println(goodInventory1.toString());
        System.out.println(goodInventory2.toString());
        System.out.println(goodInventory3.toString());
        System.out.println(goodInventory4.toString());

        // Testing the update methods
        System.out.println("Testing the update methods:");
        goodInventory1.AddAuto(goodAuto1);
        goodInventory1.AddAuto(goodAuto2);
        goodInventory1.AddAuto(goodAuto3);
        goodInventory1.AddAuto(goodAuto4);
        goodInventory1.AddAuto(new Automobile[] {goodAuto1, goodAuto2, goodAuto3, goodAuto4});
        goodInventory1.AddAuto(2090, "Ford", "Mustang", "Red", "1FATP8UH3M5111111", 0);
        goodInventory1.RemoveAuto();
        goodInventory1.RemoveAuto(goodAuto1);
        goodInventory1.RemoveAuto(0);
        System.out.println(goodInventory1.toString());

        // Testing updating a automobile in the inventory
        System.out.println("Testing updating a automobile in the inventory:");
        goodInventory1.GetAuto(0).UpdateYear(2023);
        goodInventory1.GetAuto(0).UpdateMake("Chevrolet");
        goodInventory1.GetAuto(0).UpdateModel("Camaro");
        goodInventory1.GetAuto(0).UpdateColor("Black");
        goodInventory1.GetAuto(0).UpdateVIN("1G1YY32G135333333");
        goodInventory1.GetAuto(0).UpdateMileage(100);
        System.out.println(goodInventory1.toString());
    }
}