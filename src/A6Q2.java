
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A6Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);
        //obtain # of students
        System.out.println("Please enter the number of students.");
        int students = input.nextInt();
        //create an array to obtain student heights
        double[] heights = new double[students];
        System.out.println("Please enter all the student's heights (cm).");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = input.nextDouble();
        }
        //add up and average all the heights
        double sum = 0;
        for (int x = 0; x < heights.length; x++) {
            sum = sum + heights[x];
        }
        double average = sum / heights.length;
        //checks all numbers in the array for any heights above average
        System.out.println("The above average heights are:");
        for (int a = 0; a < heights.length; a++) {
            if (heights[a] > average) {
                System.out.println("" + heights[a]);
            }
        }


    }
}
