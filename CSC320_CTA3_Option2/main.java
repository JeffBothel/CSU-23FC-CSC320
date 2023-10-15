public class main {
    public static void main(String[] args) {
        System.out.println("Family Grocery Budget Calculator");
        System.out.println("================================");

        //  Choosing to definite the majority of my variables ahead of time
        float groceryTotal = 0;
        float couponTotal = 0;
        int groceriesCount = 0;
        String userInput = "";

        // Main program loop that allows repeated use
        while(true){
            // Get the previous 4 weeks of grocery amounts
            while(groceriesCount < 4){
                groceryTotal += Float.parseFloat(System.console().readLine("Enter grocery amount for week " + (groceriesCount + 1) + ": "));
                groceriesCount++;
            }

            // Gather the coupon input from the user
            couponTotal = Float.parseFloat(System.console().readLine("Enter coupon percentage in .00 notation: "));
            if((couponTotal > 1) || (couponTotal < 0)){
                System.out.println("Invalid coupon percentage. We are setting the coupon amount to .10");
                couponTotal = .10f;
            }

            // Printing to the user the weekly budget amount and the total for the month that was given
            System.out.println("\nBudget for Groceries (Before Coupons): ");
            System.out.println("Your weekly budget is: " + String.format("%.2f",(groceryTotal / 4)));
            System.out.println("Your monthly budget is: " + String.format("%.2f",(groceryTotal)) + "\n");
            System.out.println("Budget for Groceries (After Coupons): ");
            System.out.println("Your weekly budget is: " + String.format("%.2f",((groceryTotal / 4) - ((groceryTotal / 4) * couponTotal))));
            System.out.println("Your monthly budget is: " + String.format("%.2f",((groceryTotal - (groceryTotal * couponTotal)))) + "\n");

            // Get the input as to whether to continue the calcuator
            userInput = System.console().readLine("To run again, enter anything. To end, press enter ");
            if(userInput.equals("")){
                break;
            }
            else{
                continue;
            }
        }
    }
}
