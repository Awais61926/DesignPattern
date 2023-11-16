/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labmid;

/**
 *
 * @author Lenovo
 */
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class labmid {
    public static void main(String[] args) {
        
        List<Student> students = Arrays.asList(
                new Student("Student1", 101, "Computer Science", 3),
                new Student("Student2", 102, "Electrical Engineering", 4),
                new Student("Student3", 103, "Mechanical Engineering", 2)
               
        );

       
        List<Computer> computers = Arrays.asList(
                new Computer(1, "Linux", "Programming Tools"),
                new Computer(2, "Windows", "Office Tools"),
                new Computer(3, "Linux", "Graphics Tools")
                  );

     
        ComputerLab oddRegNumberLab = new ComputerLab(new OddRegNumberStrategy());

        
        List<Computer> oddRegNumberComputers = oddRegNumberLab.allocateComputers(students, computers);

        System.out.println("Linux Computers (Odd Reg Number Allocation):");
        printAllocatedComputers(oddRegNumberComputers.iterator());

        ComputerLab evenRegNumberLab = new ComputerLab(new EvenRegNumberStrategy());

        List<Computer> evenRegNumberComputers = evenRegNumberLab.allocateComputers(students, computers);

        System.out.println("\nWindows Computers (Even Reg Number Allocation):");
        printAllocatedComputers(evenRegNumberComputers.iterator());
    }

    private static void printAllocatedComputers(Iterator<Computer> iterator) {
        while (iterator.hasNext()) {
            Computer computer = iterator.next();
            System.out.println("Computer #" + computer.compNumber + ": OS - " + computer.os + ", Tools - " + computer.tools);
        }
    }
}

