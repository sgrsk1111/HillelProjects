package com.zghurska.projects.homework.homework4;

public class JourneyPart2 {

    public static void main(String[] args) {
        int fullCost = 0;
        int ticketPrice = 100;
        int quantityPassengers = 40;
        String travelDirection = "Tokyo";
//        int numberTickets = 43;
        int numberTickets = 40;
//       int numberTickets = 38;

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

        int tickets = getNumberTickets(quantityPassengers, numberTickets);
        System.out.println(tickets);

        int infoTickets = getInfoTickets( tickets, quantityPassengers, numberTickets);
        System.out.println(infoTickets);
    }

    public static int getNumberTickets(int quantityPassengers, int numberTickets){
        int controlTickets = 0;
        if(quantityPassengers < numberTickets){
            controlTickets = 1;
        }
        else if(quantityPassengers == numberTickets){
            controlTickets = 0;
        }
        else{
            controlTickets = -1;
        }
        return controlTickets;
    }
    public static int getInfoTickets(int tickets, int quantityPassengers, int numberTickets){
        if (tickets<=0) {
            tickets = quantityPassengers - numberTickets;
            System.out.println("Available number of tickets to purchase - " + tickets);
        }
        else{
            tickets = quantityPassengers - numberTickets;
            System.out.println("Hi!Unfortunately, you can't buy tickets.");
            System.out.println(tickets + " - not enough tickets to buy");
        }
        return tickets;
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
