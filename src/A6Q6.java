
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner 
        Scanner input = new Scanner(System.in);

        //prompt user to enter in size of the class
        System.out.println("How many students are in the class?");
        int students = input.nextInt();

        //create an array
        int[] marks = new int[students];
        //reads in all the marks
        System.out.println("Please enter the marks of every student.");
        for (int i = 0; i < students; i++) {
            marks[i] = input.nextInt();
        }

        //prompt to enter marks and store them in array, then sort
        //for statement for each position in the array
        for (int a = 0; a < marks.length; a++) {
            //for statement for sorting each position
            for (int first = 0; first < marks.length; first++) {
                if (marks[first] > marks[a]) {
                    int small = marks[first];
                    int big = marks[a];
                    marks[a] = small;
                    marks[first] = big;
                }
            }
        }
        //displays lowest, highest and average marks of the class
        System.out.println("The lowest mark in the class is " + marks[0] + ". Sorry!");
        System.out.println("The highest mark in the class is " + marks[marks.length - 1] + ". Good job!");

        int average = 0;
        for (int x = 0; x < marks.length; x++) {
            average = average + marks[x];
        }
        int mean = average / marks.length;

        System.out.println("The average mark in the class is " + mean + ".");
    }
}
