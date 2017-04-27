/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a list of numbers from 2 to 1000
        int[] number = new int[1000];
        for (int i = 0; i < number.length; i++) {
            number[i] = i;
        }
        //finds all prime numbers from 2 to 1000 by setting all non-primes to -1, then 
        //displays all numbers not set to -1
        for (int p = 2; p < 1000;) {
            if (number[p] != -1) {
                int increment = p;
                int mark = p + increment;
                while (mark < 1000) {
                    number[mark] = -1;
                    mark = mark + increment;
                }
                p++;
            } else {
                p++;
            }
        }
        System.out.println("The prime numbers between 2 and 1000 are: ");
        for (int x = 2; x < 1000; x++) {
            if (number[x] != -1) {
                System.out.println(x);
            }
        }
    }
}
