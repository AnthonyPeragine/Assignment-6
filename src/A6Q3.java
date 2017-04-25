
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);

        //prompts user for 2 integers
        System.out.println("Please enter two integers.");
        int[] integer = new int[2];
        for (int i = 0; i < 2; i++) {
            integer[i] = input.nextInt();
        }
        //determines which int is smaller then replaces the arrays in order
        for (int x = 0; x < 2; x++) {
            if (integer[1] < integer[0]) {
                int small = integer[1];
                int big = integer[0];
                integer[0] = small;
                integer[1] = big;
            }
        }
        System.out.println("The integers in ascending order are " + integer[0] + ", " + integer[1]);
    }
}
