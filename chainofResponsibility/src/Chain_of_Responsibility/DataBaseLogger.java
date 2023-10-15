/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Chain_of_Responsibility;

/**
 *
 * @author Lenovo
 */
 class DatabaseLogger extends AbstractLogger 
 {

   public DatabaseLogger(int level)
   {
      this.level = level;
   }

   @Override
   protected void write(String message) 
   {		
      System.out.println("Database::Logger: " + message);
   }
}
