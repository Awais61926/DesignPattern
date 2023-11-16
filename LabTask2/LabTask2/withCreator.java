/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabTask2;

/**
 *
 * @author Lenovo
 */
 class Manager 
   {
       
   private int manager_id;
   private String manager_name;
   
   //Constructor
    Manager(int id , String name)
    {
        this.manager_id = id;
        this.manager_name = name;
    }
    void Introduction()
    { 
        System.out.println("Manager ID: \t"+manager_id+"\tManager Name: \t"+manager_name);
    }
}

class ManagerCreator
{
   public Manager createManager(int id , String name)
    {
       return new Manager(id,name);
    }
   
}