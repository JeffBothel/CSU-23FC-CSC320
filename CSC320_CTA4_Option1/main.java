public class main {

    // Main entry point for the program
    public static void main(String[] args) {
        // Create the initial array for values gathered from the user
        float[] values = new float[6];

        // Introduces the user to the program
        System.out.println("\nProgram for calculating the average of a set of values.");
        System.out.println("Enter as many values as you want and type 'end' or 'exit' to exit the program. Pressing enter will output results.\n");

        // Loop that allows the user to enter as many values as they want and exit is based on a switch
        String userInput = "";
        int valueCount = 0;
        while(true){
            // Prompt the user for a value
            System.out.print("Enter a value: ");
            userInput = System.console().readLine();

            // Check the operation the user wants to perform
            switch(userInput) {
                case "exit":
                    System.out.println("Exiting...");
                    System.exit(0);
                case "end":
                    System.out.println("Exiting...");
                    System.exit(0);
                case "":
                    // Calculate the values to present to the user
                    float sum = 0;
                    for(int i = 0; i < values.length; i++) {
                        sum += values[i];
                    }
                    float average = sum / valueCount;
                    float min = 0;
                    float max = 0;
                    for(int i = 0; i < valueCount; i++) {
                        if(i == 0) {
                            min = values[i];
                            max = values[i];
                        }
                        if(values[i] < min) {
                            min = values[i];
                        }
                        if(values[i] > max) {
                            max = values[i];
                        }
                    }

                    // Output the results to the user
                    System.out.println("\nCalculations are based on non-zero values.");
                    System.out.println("The sum of the values is: " + sum);
                    System.out.println("The average of the values is: " + average);
                    System.out.println("The smallest value is: " + min);
                    System.out.println("The largest value is " + max);
                    System.out.println("Interest on total: " + (sum * 0.2) + "\n");
                    
                    // What user wants to do after output of calculations
                    userInput = System.console().readLine("Enter another set of values?: ");
                    switch(userInput) {
                        case "exit":
                            System.out.println("Exiting...");
                            System.exit(0);
                        case "end":
                            System.out.println("Exiting...");
                            System.exit(0);
                        default:
                            System.out.println("\n");
                            values = new float[6];
                            valueCount = 0;
                            userInput = "";
                            continue;
                    }
                default:
                    // If this is just a normal addition of a number to the array
                    if(valueCount < values.length) {                        
                        values[valueCount] = Float.parseFloat(userInput);
                        valueCount++;
                    }
                    // If the array needs to be increased
                    else {
                        float[] tempValues = new float[values.length + 3];
                        for(int i = 0; i < values.length; i++) {
                            tempValues[i] = values[i];
                        }
                        values = null;
                        values = new float[tempValues.length];
                        for(int i = 0; i < tempValues.length; i++) {
                            values[i] = tempValues[i];
                        }
                        values[valueCount] = Float.parseFloat(userInput);
                        valueCount++;
                    }
            }
        }
    }
}
