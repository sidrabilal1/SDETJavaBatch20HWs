package org.example.e18;

public class E18ShoppingCartRoundingTypeCasting {
    public static void main(String[] args) {
        // Declare the double variables and assign values
        double item1 = 19.99;
        double item2 = 29.75;
        double item3 = 4.99;
        // calculate total cost
        double totalCast = (item1 + item2 + item3);

        // Type cast the double to an int to round it down
        int roundedCost = (int) totalCast;

        // Print ""the results
        System.out.println("The original total cost is $" + totalCast);
        System.out.println("The rounded total cost is $" + roundedCost);

    }
}