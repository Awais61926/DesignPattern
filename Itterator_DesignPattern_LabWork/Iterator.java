/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator;

/**
 *
 * @author fa20-bse-021
 */
public interface Iterator {
    public boolean hasNext();
    public Object next();
    public boolean hasPrevious(); 
    public Object previous();     
}
