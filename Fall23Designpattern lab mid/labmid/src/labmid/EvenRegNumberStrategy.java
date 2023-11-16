/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmid;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.List;

public class EvenRegNumberStrategy implements AllocationStrategy {
    @Override
    public List<Computer> allocateComputers(List<Student> students, List<Computer> computers) {
        List<Computer> allocatedComputers = new ArrayList<>();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).regNumber % 2 == 0) {
                allocatedComputers.add(computers.get(i));
            }
        }

        return allocatedComputers;
    }
}

