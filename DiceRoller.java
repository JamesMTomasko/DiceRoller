/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroller;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author James
 */
public class DiceRoller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please make a selection.\n1. Legends of the Wulin\n2. D&D\n");
        int in = scan.nextInt();
        switch(in) {
            case 1:
                Legends();
                break;
            case 2:
                dnd();
                break;
        }
        
    }
    
    public static void run() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please make a selection.\n1. Legends of the Wulin\n2. D&D\n");
        int in = scan.nextInt();
        switch(in) {
            case 1:
                Legends();
                break;
            case 2:
                dnd();
                break;
        }
    }
    
    public static void Legends() {
        Random ran = new Random();
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter the size of the Lake: ");
            int size = scan.nextInt();
            int[] a = new int[10];
            int current;
            for(int i = 1; i <= size; i++) {
                current = ran.nextInt(10);
                a[current]++;
            }
            System.out.println("The results are:");
            for(int i = 0; i < 10; i++) {
                if (a[i] > 0) {
                    System.out.print(a[i]);
                    System.out.println(i);
                }
            }
            System.out.print("Keep rolling? (Y/N): ");
            String in = scan.nextLine();
            in = scan.nextLine();
            if (in.equals("N") || in.equals("n")) {
                break;
            } else {
                
            }
        }
    }
    
    public static void dnd() {
        Random ran = new Random();
        while(true) {
            Scanner scan = new Scanner(System.in);
            System.out.print("What dice would you like to roll? (xdy): ");
            String in = scan.nextLine();
            String[] values = in.split("d");
            int num = Integer.parseInt(values[0].trim());
            int size = Integer.parseInt(values[1].trim());
            System.out.print("Enter the modifier: ");
            int mod = Integer.parseInt(scan.nextLine());
            int temp = 0;
            for(int i = 0; i < num; i++) {
                temp = ran.nextInt(size)+1;
                System.out.println(temp);
                mod += temp;
            }
            System.out.println("The result is: " + mod);
            System.out.print("Keep rolling? (Y/N): ");
            in = scan.nextLine();
            if (in.equals("N") || in.equals("n")) {
                break;
            } else {
                
            }
        }
    }
}
