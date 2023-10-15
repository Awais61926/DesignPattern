/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VisitorPattern_LabTask;

/**
 *
 * @author TechEnclave Computer
 */
interface Visitor 
{
    void visit(Student student);
    void visit(Transcript transcript);
}