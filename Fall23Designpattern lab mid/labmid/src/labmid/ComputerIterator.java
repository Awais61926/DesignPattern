/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labmid;

/**
 *
 * @author Lenovo
 */
import java.util.Iterator;
import java.util.List;

public class ComputerIterator implements Iterator<Computer> {
    private List<Computer> computers;
    private int index;

    public ComputerIterator(List<Computer> computers) {
        this.computers = computers;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < computers.size();
    }

    @Override
    public Computer next() {
        return computers.get(index++);
    }
}

