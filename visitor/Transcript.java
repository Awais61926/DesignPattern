/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VisitorPattern_LabTask;

/**
 *
 * @author Lenovo
 */
class Transcript implements Element 
{
    private int rollNo;
    private String transcriptData;

    public Transcript(int rollNo, String transcriptData) {
        this.rollNo = rollNo;
        this.transcriptData = transcriptData;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getTranscriptData() {
        return transcriptData;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

