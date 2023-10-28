import java.io.Console;

public class main {
    public static void main(String[] args) {
        System.out.println("CSC320 Programming I - CAT 5 Programming Assignment");
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        float[] dayTemps = new float[7];
        String[] userInputs = new String[6];
        Console inputConsole = System.console();
        float tempSum = 0;

        // Main user input loop
        while(true) {
            System.out.println("Input command:");
            String userLine = inputConsole.readLine();
            userInputs = userLine.split(" ");
            switch(userInputs[0]) {
                case "add":
                    switch(userInputs[1]) {
                        case "1":
                        case "monday":
                            dayTemps[0] = Float.parseFloat(userInputs[2]);
                            continue;
                        case "2":
                        case "tuesday":
                            dayTemps[1] = Float.parseFloat(userInputs[2]);
                            continue;
                        case "3":
                        case "wednesday":
                            dayTemps[2] = Float.parseFloat(userInputs[2]);
                            continue;
                        case "4":
                        case "thursday":
                            dayTemps[3] = Float.parseFloat(userInputs[2]);
                            continue;
                        case "5":
                        case "friday":
                            dayTemps[4] = Float.parseFloat(userInputs[2]);
                            continue;
                        case "6":
                        case "saturday":
                            dayTemps[5] = Float.parseFloat(userInputs[2]);
                            continue;
                        case "7":
                        case "sunday":
                            dayTemps[6] = Float.parseFloat(userInputs[2]);
                            continue;
                        default:
                            System.out.println("Invalid day");
                            continue;
                    }
                case "display":
                    switch(userInputs[1]) {
                        case "1":
                        case "monday":
                            System.out.println("Temprature for " + daysOfWeek[0] + ": " + dayTemps[0]);
                            continue;
                        case "2":
                        case "tuesday":
                            System.out.println("Temprature for " + daysOfWeek[1] + ": " + dayTemps[1]);
                            continue;
                        case "3":
                        case "wednesday":
                            System.out.println("Temprature for " + daysOfWeek[2] + ": " + dayTemps[2]);
                            continue;
                        case "4":
                        case "thursday":
                            System.out.println("Temprature for " + daysOfWeek[3] + ": " + dayTemps[3]);
                            continue;
                        case "5":
                        case "friday":
                            System.out.println("Temprature for " + daysOfWeek[4] + ": " + dayTemps[4]);
                            continue;
                        case "6":
                        case "saturday":
                            System.out.println("Temprature for " + daysOfWeek[5] + ": " + dayTemps[5]);
                            continue;
                        case "7":
                        case "sunday":
                            System.out.println("Temprature for " + daysOfWeek[6] + ": " + dayTemps[6]);
                            continue;
                        case "week":
                            int i = 0;
                            while(i < 7) {
                                System.out.println("Temprature for " + daysOfWeek[i] + ": " + dayTemps[i]);
                                tempSum += dayTemps[i];
                                i++;
                            }
                            System.out.println("Average temprature for the week: " + (tempSum / 7));
                            continue;
                        default:
                            System.out.println("Invalid day");
                            continue;
                    }
                case "done":
                case "end":
                case "exit":
                    System.exit(0);
                default:
                    System.out.println("Invalid command");
                    continue;
            }
        }
   }
}
