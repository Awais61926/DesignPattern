/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTask2;

/**
 *
 * @author Lenovo
 */
 interface DataService 
{
    String fetchData();
}
 class ConcreteDataService implements DataService 
 {
    @Override
    public String fetchData() {
        
        return "Data from ConcreteDataService";
    }
}
 class DataServiceIndirection implements DataService 
 {
    private final DataService delegate;

     DataServiceIndirection(DataService delegate) {
        this.delegate = delegate;
    }

    @Override
     public String fetchData() 
     {
      
        return delegate.fetchData();
    }
 }