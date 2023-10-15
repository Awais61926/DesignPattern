/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Chain_of_Responsibility;

/**
 *
 * @author Lenovo
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
  private static AbstractLogger getChainOfLoggers(){

      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger warningLogger = new DatabaseLogger(AbstractLogger.WARNING);
      AbstractLogger infoLogger = new ConsoleLogger(AbstractLogger.INFO);

      errorLogger.setNextLogger(warningLogger);
      warningLogger.setNextLogger(infoLogger);

      return errorLogger;   
   }

   public static void main(String[] args) {
      AbstractLogger loggerChain = getChainOfLoggers();

      loggerChain.logMessage(AbstractLogger.INFO, 
         "This is an information.");

      loggerChain.logMessage(AbstractLogger.WARNING, 
         "This is a warning message to the database logger.");

      loggerChain.logMessage(AbstractLogger.ERROR, 
         "This is an error information.");
   }
}
