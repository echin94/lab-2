/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.Scanner;

/**
 *
 * This lab asks us to compute, using the least amount of coins as possible, 
 * the number of coins needed from each coin type, that also sums up to exactly 
 * the change. Then, we need print the number of coins for type. 
 * Afterwards, print out the total number of coins required to change 
 * out the initial amount entered.
 * 
 * 
 * @author Evan and Mohammed
 * @version 3/3/2015
 * 
 * 
 * 
 */
public class CoinChanger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int change;
        int sum;
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter an amount:");
        change = keyboard.nextInt();

        int Quarters;
        Quarters = change / 25;
        System.out.println("Quarters: " + Quarters);
        change = change % 25;

        int Dimes;
        Dimes = change / 10;
        System.out.println("Dimes: " + Dimes);
        change = change % 10;

        int Nickels;
        Nickels = change / 5;
        System.out.println("Nickels: " + Nickels);
        change = change % 5;

        int Pennies;
        Pennies = change / 1;
        System.out.println("Pennies: " + Pennies);
        change = change % 1;
        
        sum = Quarters + Dimes + Nickels + Pennies;
        
        System.out.println("Total number of coins: " + sum);
        
        

    }

}
