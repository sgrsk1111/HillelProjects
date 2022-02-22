package com.zghurska.projects.homework.homework3;

import java.util.Scanner;

public class Journey {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ticketPrice = 100;
        int tickets = 0;
        int quantityPassengers = 40;
        String directionOne = "Tokyo";
        String directionTwo = "Rome";
        String directionThree = "Stambul";
        String directionFour = "Los-Angeles";
        int numberTickets = 0;
        int accountClients = 0;
        int ticketsOne = 130;
        int ticketsTwo = 110;
        int ticketsThree = 115;
        int ticketsFour = 150;
        String direction = null;

        greetings();

        System.out.println("How can I call you?");
        String name = scanner.next();
        System.out.println("Please "+name+", choose direction: 1-Tokyo, 2-Rome, 3-Stambul, 4-Los-Angeles, 0-Exit");

       int userInfo = getUserInfo(scanner);
        switch (userInfo){
            case 1:
                direction = directionOne;
                ticketPrice = ticketsOne;
                System.out.println("Price one ticket = "+ticketPrice);
                break;
            case 2:
                direction = directionTwo;
                ticketPrice = ticketsTwo;
                System.out.println("Price one ticket = "+ticketPrice);
                break;
            case 3:
                direction = directionThree;
                ticketPrice = ticketsThree;
                System.out.println("Price one ticket = "+ticketPrice);
                break;
            case 4:
                direction = directionFour;
                ticketPrice = ticketsFour;
                System.out.println("Price one ticket = "+ticketPrice);
                break;
            case 0:
                System.out.println("Thanks!Bye!");
                System.exit(0);
            default:
                System.out.println("Input correct info");
                System.exit(0);
        }

        int infoTickets = getInfoTickets( tickets, quantityPassengers, numberTickets);
        System.out.println("Available number of tickets to purchase - "+infoTickets);

        System.out.println("Please, tell your rest..");
        int walletClients = getUserInfo(scanner);

        System.out.println("How many passengers want buy tickets?");
        int ticketsChoosePassengers = getUserInfo(scanner);
        if (walletClients>ticketPrice){
        getNumberTickets(ticketsChoosePassengers);
        TransactionMoney(walletClients, ticketPrice, userInfo, ticketsChoosePassengers);
        } else{
            System.out.println("Sorry, but enough money");
        }
        scanner.close();
    }
    public static void greetings() {
        System.out.println("Laddies and Gentlemen welcome aboard Sweet Airlines!");
        System.out.println("We are glad to see you on the board");
    }
    public static int getNumberTickets(int ticketChoosePassengers){
        int ticketsNumber = 40;
        if(ticketChoosePassengers < ticketsNumber){
            System.out.println("Nice!");
        }
        else{
            System.out.println("Sorry, but enough tickets");
        }
        return ticketChoosePassengers;
    }
    public static int getInfoTickets(int tickets, int quantityPassengers, int numberTickets){
        if (tickets<=0) {
            tickets = quantityPassengers - numberTickets;
        }
        else{
            tickets = quantityPassengers - numberTickets;
            System.out.println("Hi!Unfortunately, you can't buy tickets.");
            System.out.println(tickets + " - not enough tickets to buy");
        }
        return tickets;
    }
    public static void TransactionMoney( int walletClients,int ticketPrice ,int userInfo,int ticketsChoosePassengers) {
        for (int i = 0; walletClients>ticketPrice; userInfo++) {
            if (userInfo==ticketsChoosePassengers){
                int buyTickets = userInfo;
                int moneyClients = walletClients - (ticketPrice*buyTickets);
                System.out.println("Your rest money - " + moneyClients);
                System.out.println("You buy- " + buyTickets+" tickets");
            } else {
                break;
            }
        }
    }
    public static int getUserInfo(Scanner scanner){
        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        return -1;
    }
}
