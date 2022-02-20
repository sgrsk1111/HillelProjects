package com.zghurska.projects.homework.homework3;

public class Journey {

    public static void main(String[] args) {
      int fullCost = 0;
      int ticketPrice = 100;
      int quantityPassengers = 40;
      String travelDirection = "Tokyo";

        greetings();

        System.out.println("Price ticket " + ticketPrice );
        System.out.println("Quantity passengers " + quantityPassengers);
        System.out.println("Direction travel " + travelDirection);

        fullCost = getFullCost(ticketPrice,quantityPassengers);
        System.out.println("Full fly cost  " + fullCost);

        int expenses = 25;
        int additionalExpenses = getExpenses(expenses,quantityPassengers);
        System.out.println("Full additional expenses passengers " + additionalExpenses);

         int fullPriceFly=  getFullPriceFly(additionalExpenses, fullCost);
        System.out.println("Full price to Tokyo - " + fullPriceFly);
    }

    public static int getFullCost(int ticketPrice, int quantityPassengers){
        int fullCost = ticketPrice * quantityPassengers;
        return fullCost;
    }

    public static int getExpenses (int expenses, int quantityPassengers){
        int fullExpenses = expenses * quantityPassengers;
        return fullExpenses;
    }

    public static int getFullPriceFly (int additionalExpenses, int fullCost){
        int fullPriceFly = additionalExpenses + fullCost;
        return fullPriceFly;
    }

    public static void greetings() {
        System.out.println("Laddies and Gentlemen welcome aboard Sweet Airlines!");
        System.out.println("We are glad to see you on the board");
    }
}
