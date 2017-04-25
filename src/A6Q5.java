
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);
        System.out.println("How many students have marks to be entered?:");
        int students = input.nextInt();
        //creates array for marks
        double[] marks = new double[students];
        //prompts user to enter marks and scans 10 numbers in
        System.out.println("Please enter the marks of every student.");
        for (int i = 0; i < students; i++) {
            marks[i] = input.nextInt();
        }
        //for statement for each position in the array
        for (int a = 0; a < marks.length; a++) {
            //for statement for sorting each position
            for (int first = 0; first < marks.length; first++) {
                if (marks[first] > marks[a]) {
                    double small = marks[first];
                    double big = marks[a];
                    marks[a] = small;
                    marks[first] = big;
                }
            }
        }
        //displays sorted array
        System.out.println("The marks in ascending order are:");
        for (int x = 0; x < marks.length; x++) {
            System.out.println("" + marks[x]);
        }
        //checks for even or odd number then displays median
        if (marks.length % 2 == 1) {
            int middle = marks.length / 2;
            System.out.println("The median mark is " + marks[middle]);
        } else {
            int middle = marks.length / 2;
            double median = (marks[middle] + marks[middle - 1]) / 2;
            System.out.println("The median mark is " + median + ".");


        }





    }
}
