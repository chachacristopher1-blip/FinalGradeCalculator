/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package FinalGradeCalculator;
import java.util.Scanner;
public class MainCalculator {

    public static void main(String[] args) 
    {
        GradeCalculator calculator = new GradeCalculator();
        Scanner scanner = new Scanner(System.in);
    //This is my first complete program (26/03/2026)
        System.out.println("Hello! In this program you can calculate your final grade.");
    //The final grade is divided into two parts: Term grade(80%), and the final exam(20%).
    //Term grade is divided in two: First and Second, both are added and divided to two.
    //The final grade is calculated on a scale from 0 to 10.
    //The student passes if the final grade is 7.0 or higher.
    double term1;
    do{
        System.out.print("Please tell me your grade of the first term ------->");
        term1=scanner.nextDouble();
    }while(term1<0 || term1>10);
    double term2;
    do{
        System.out.print("Thanks! Now tell me your grade of the second term ------->");
        term2=scanner.nextDouble();
    }while(term2<0 || term2>10);
    double finalExamGrade;
    do{
        System.out.print("OK! Finally tell me your grade of the final exam ------->");
        finalExamGrade=scanner.nextDouble();
    }while(finalExamGrade<0 || finalExamGrade>10);
        double termGrade=calculator.calculateTermGrade(term1, term2);
        double examGrade=calculator.calculateExamGrade(finalExamGrade);
        double finalGrade=calculator.calculateFinalGrade(termGrade, examGrade);
        if (finalGrade>=7)
        {
            System.out.println("Congratulations! You passed.");
            System.out.printf("Your final grade is %.2f", finalGrade);
        }
         else
        {
            System.out.println("Unfortunately, you didn't pass.");
            System.out.printf("Your final grade is %.2f", finalGrade);
        }

    }
}
