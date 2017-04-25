
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author peraa0837
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner
        Scanner input = new Scanner(System.in);
        //obtain number of students
        System.out.println("How many student's marks do you have?:");
        int students = input.nextInt();
        System.out.println("Please enter all of their marks.");
        //create an array
        double[] marks = new double[students];
        //obtains all 5 heights from students
        for (int i = 0; i < marks.length; i++) {
            marks[i] = input.nextDouble();
        }
        //finds the sum of all marks
        double sum = 0;
        for (int x = 0; x < marks.length; x++) {
            sum = sum + marks[x];
        }
        //averages all the marks, roudns to the nearest hundredth and then displays the average
        double average = sum / marks.length;
        average = Math.round(average * 100) / 100.0;
        System.out.println("The average of the class is " + average + ".");
    }
}
