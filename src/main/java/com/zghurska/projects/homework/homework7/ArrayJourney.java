package com.zghurska.projects.homework.homework7;

public class ArrayJourney {

    public static void main(String args[]) {
        String[] direction = {"Rome", "Tokyo", "Saint-Petersburg", "Moscow", "Istanbul", "New-York", "Madrid", "Minsk", "London", "Paris"};
        int[] price = {150, 200, 120, 100, 115, 220, 180, 90, 160, 130};

        directionArray(direction);
        priceArray(price);
        directionArrayReverse(direction);
        priceArrayReverse(price);
        printInformation(direction,price);

    }
    public static void directionArray(String[] direction) {
        for (String element : direction) {
            System.out.println("Direction = " + (element));
        }
    }
    public static void priceArray(int[] price) {
        for (int element : price) {
            System.out.println("Price tickets = " + (element));
        }
    }
    public static void directionArrayReverse(String[] direction) {
        for ( int i = direction.length-1; i>=0;i--){
            System.out.println("Direction = " + direction[i]);
        }
    }
    public static void priceArrayReverse(int[] price) {
        for ( int i = price.length-1; i>=0;i--){
            System.out.println("Price tickets = " + price[i]);
        }
    }
    public static void printInformation(String[] direction,int[] price) {
        for ( int i = 0; i<price.length;i++){
            System.out.println("Direction = " + direction[i] +", price tickets = " + price[i]);
        }
    }
}
