/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VisitorPattern_LabTask;

/**
 *
 * @author TechEnclave Computer
 */
public class VisitorPatternMain 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        RecordVisitor recordVisitor = new RecordVisitor();

        Student student = new Student("Irfan Khan", 1);
        student.accept(recordVisitor);
        Transcript transcript = new Transcript(1, "ICT: A, OOP: B");
        transcript.accept(recordVisitor);
        
        Student student1 = new Student("Alyan Ahamad", 2);
        student1.accept(recordVisitor);
        Transcript transcript1 = new Transcript(2, "PF: A, OOP: B");
        transcript1.accept(recordVisitor);
    }
    
}
