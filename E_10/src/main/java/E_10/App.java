package E_10;




import java.util.Scanner;
/**
 * *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  *  Copyright 2021 Kevin Kant
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner reader = new Scanner(System.in);
        final float taxConstant = (float) .055;
        int[] price = new int[3];
        int[] amount = new int[3];
        float subtotal = 0;

        for(int i = 0 ; i < 3; i++){
            System.out.printf("Enter the price of item %d ", i+1);
            price[i] = Integer.parseInt(reader.nextLine());
            System.out.printf("Enter the amount of item %d ",i+1);
            amount[i] = Integer.parseInt(reader.nextLine());
        }

        for(int i = 0; i < 3; i++){
            subtotal += price[i] * amount[i];
        }

        float tax = subtotal * taxConstant;

        float total = subtotal + tax;

        System.out.printf("Your subtotal is %.2f$%n", subtotal);
        System.out.printf("Your tax is %.2f$%n",tax);
        System.out.printf("Your total is %.2f$%n",total);
    }
}
