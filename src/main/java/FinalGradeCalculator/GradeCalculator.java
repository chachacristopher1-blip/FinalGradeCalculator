/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FinalGradeCalculator;

public class GradeCalculator 

{
    double calculateTermGrade(double term1, double term2)
    {
        double termGrade=((term1+term2)/2)*0.8;
        return termGrade;
    }
    double calculateExamGrade(double finalExamGrade)
    {
        double examGrade=finalExamGrade*0.2;
        return examGrade;
    }
    double calculateFinalGrade(double termGrade, double examGrade)
    {
        return(termGrade+examGrade);
    }
}



