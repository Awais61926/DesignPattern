/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmid;

/**
 *
 * @author Lenovo
 */
import java.util.List;

public class ComputerLab {
    private AllocationStrategy allocationStrategy;

    public ComputerLab(AllocationStrategy allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    public List<Computer> allocateComputers(List<Student> students, List<Computer> computers) {
        return allocationStrategy.allocateComputers(students, computers);
    }
}

