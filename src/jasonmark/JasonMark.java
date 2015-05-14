/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jasonmark;
import java.util.*;


/**
 *
 * @author rishigoel
 */
public class JasonMark {

    /**
     * @param args the command line arguments
     */
    
    public double pA () {
     double score = 0;
     double weight = 0;
     Scanner next=new Scanner (System.in);
     System.out.println("What is the weighting?");
     weight=next.nextDouble();
     System.out.println("What was your overall average for this type of grade?");
     score=next.nextDouble();
     score =score/100*weight;
     return score;
    }
    
    public double exam (double total2, double weight) {
        
        total2=60-total2;
        weight=total2/weight *100;
        return weight;
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Welcome to Jason's mark calculator.  Press enter to begin");
        int yes=0;
        double PA=0;
        double Lab=0;
        double assignment=0;
        double midterm=0;
        double design=0;
        double quiz=0;
        double tut=0;
        double exam=0;
        double total2 = 0;
        String y="";
        JasonMark total =new JasonMark ();
        Scanner jason=new Scanner (System.in);
        while (yes==0) {
            System.out.println("Are there any PA's?");
            y=jason.nextLine();
            if (y.equalsIgnoreCase("Yes")) {
                PA=total.pA();
                
            }
            System.out.println("Are there any labs?");
            y=jason.nextLine();
            if (y.equalsIgnoreCase("Yes")) {
                Lab=total.pA();
            }
            System.out.println("Was there a midterm?");
            y=jason.nextLine();
            if (y.equalsIgnoreCase("Yes")) {
                midterm=total.pA();
            }
            System.out.println("Are there any quizzes");
            y=jason.nextLine();
            if (y.equalsIgnoreCase("Yes")) {
                quiz=total.pA();
            }
            System.out.println("Are there any interactive tutorials?");
            y=jason.nextLine();
            if (y.equalsIgnoreCase("Yes")) {
                tut=total.pA();
            }
            System.out.println("Are there any assignments?");
            y=jason.nextLine();
            if (y.equalsIgnoreCase("Yes")) {
                assignment=total.pA();
                
            }
            System.out.println("Was there a design project?");
            y=jason.nextLine();
            if (y.equalsIgnoreCase("Yes")) {
                design=total.pA();
                
            }
            
            System.out.println("PA: "+PA);
            System.out.println("LABS: "+Lab);
            System.out.println("Midterm: "+midterm);
            System.out.println("Tutorial: "+tut);
            System.out.println("Quizzes: "+quiz);
            System.out.println("Design: "+design);
            System.out.println("Assignments: "+assignment);
            System.out.println("What is the exam weighting?");
            total2=PA+Lab+midterm+tut+quiz+design+assignment;
            exam=jason.nextDouble();
            exam=total.exam(total2, exam);
            if (exam < 0) {
                System.out.println("You've already passed!");
            }
            
            else {
                
                System.out.println("You need a: "+exam);
            }
            
            System.out.println("Enter 0 to Continue");
            yes=jason.nextInt();
            
        }
    }
}
