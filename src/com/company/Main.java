package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] products = {"Apple", "Pineapple", "Blackberry", "Strawberry", "Pear", "Red berry", "Grapes"};

        int arrayLength = products.length;

        Scanner userInputName = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = userInputName.nextLine();
        System.out.println("Hello," + name + " ! \n");
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter what are you searching for: ");
        String searchName = userInput.nextLine();

        for (int i = 0; i < arrayLength; i++) {
            if (products[i].toLowerCase().contains(searchName.toLowerCase()) == true) {

                System.out.println(products[i]);
            }
        }
    }
}
