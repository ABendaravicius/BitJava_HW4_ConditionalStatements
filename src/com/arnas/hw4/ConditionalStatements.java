package com.arnas.hw4;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Įveskite savo amžių: ");
        String amzius = userInput.nextLine();

        if (Integer.parseInt(amzius) >= 18) {
            System.out.println("Jūs turite balso teisę.");
        } else {
            System.out.println("Jūs neturite balso teisės.");
        }

        System.out.println("--- Patobulinta programa ---");

        System.out.println("Įveskite savo amžių: ");
        amzius = userInput.nextLine();

        int amziusSkaicius = Integer.parseInt(amzius);

        if (amziusSkaicius >= 45) {
            System.out.println("Jūs turite balso teisę bei galite kandidatuoti.");
        } else if (amziusSkaicius >= 18) {
            System.out.println("Jūs turite balso teisę.");
        } else {
            System.out.println("Jūs neturite balso teisės.");
        }
    }
}