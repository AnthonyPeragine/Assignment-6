
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);
        //creates array for marks
        double[] marks = new double[10];
        //prompts user to enter marks and scans 10 numbers in
        System.out.println("Please enter 10 marks.");
        for (int i = 0; i < 10; i++) {
            marks[i] = input.nextInt();
        }
        //for statement for each position in the array
        for (int a = 0; a < 10; a++) {
            //for statement for sorting each position
            for (int first = 0; first < 10; first++) {
                if (marks[first] > marks[a]) {
                    double small = marks[first];
                    double big = marks[a];
                    marks[a] = small;
                    marks[first] = big;
                }
            }
        }
        //displays sorted array
        System.out.println("The 10 marks in ascending order are:");
        for (int x = 0; x < 10; x++) {
            System.out.println("" + marks[x]);
        }
    }
}
