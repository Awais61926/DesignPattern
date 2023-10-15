/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VisitorPattern_LabTask;

/**
 *
 * @author Lenovo
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
class RecordVisitor implements Visitor 
{

    private static final String STUDENTS_FILE = "C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\visitor\\src\\visitor\\Students.txt";
    private static final String TRANSCRIPT_FILE = "C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\visitor\\src\\visitor\\Transcript.txt";

     public static void addStudentRecord(Student student) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(STUDENTS_FILE, true))) {
            writer.write(student.getName() + "," + student.getRollNo() + "\n");
            System.out.println("Student record added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void viewStudentRecords() {
        try (BufferedReader reader = new BufferedReader(new FileReader(STUDENTS_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void updateStudentRecord(int rollNo, String newName) {
        try {
            File file = new File(STUDENTS_FILE);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int currentRollNo = Integer.parseInt(data[1]);
                if (currentRollNo == rollNo) {
                    writer.write(newName + "," + rollNo + "\n");
                } else {
                    writer.write(line + "\n");
                }
            }

            reader.close();
            writer.close();

            if (!file.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            if (!tempFile.renameTo(file)) {
                System.out.println("Could not rename file");
            } else {
                System.out.println("Student record updated successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudentRecord(int rollNo) {
        try {
            File file = new File(STUDENTS_FILE);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int currentRollNo = Integer.parseInt(data[1]);
                if (currentRollNo != rollNo) {
                    writer.write(line + "\n");
                }
            }

            reader.close();
            writer.close();

            if (!file.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            if (!tempFile.renameTo(file)) {
                System.out.println("Could not rename file");
            } else {
                System.out.println("Student record deleted successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void addTranscript(Transcript transcript) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(TRANSCRIPT_FILE, true))) {
            writer.write(transcript.getRollNo() + "," + transcript.getTranscriptData() + "\n");
            System.out.println("Transcript added successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void viewTranscripts() {
        try (BufferedReader reader = new BufferedReader(new FileReader(TRANSCRIPT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void updateTranscript(int rollNo, String newTranscriptData) {
        try {
            File file = new File(TRANSCRIPT_FILE);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int currentRollNo = Integer.parseInt(data[0]);
                if (currentRollNo == rollNo) {
                    writer.write(rollNo + "," + newTranscriptData + "\n");
                } else {
                    writer.write(line + "\n");
                }
            }

            reader.close();
            writer.close();

            if (!file.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            if (!tempFile.renameTo(file)) {
                System.out.println("Could not rename file");
            } else {
                System.out.println("Transcript updated successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteTranscript(int rollNo) {
        try {
            File file = new File(TRANSCRIPT_FILE);
            File tempFile = new File("temp.txt");

            BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int currentRollNo = Integer.parseInt(data[0]);
                if (currentRollNo != rollNo) {
                    writer.write(line + "\n");
                }
            }

            reader.close();
            writer.close();

            if (!file.delete()) {
                System.out.println("Could not delete file");
                return;
            }

            if (!tempFile.renameTo(file)) {
                System.out.println("Could not rename file");
            } else {
                System.out.println("Transcript deleted successfully.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void visit(Student student) {
         addStudentRecord(student);
    }

    @Override
    public void visit(Transcript transcript) {
        addTranscript(transcript);
    }
}