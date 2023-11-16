/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategybyTutorialpoint;

/**
 *
 * @author FA20-BSE-021
 */
public class StrategyPatternDemo {
   public static void main(String[] args) {
      Context context = new Context(new OperationAdd());		
      System.out.println("55 + 20 = " + context.executeStrategy(55, 20));

      context = new Context(new OperationSubstract());		
      System.out.println("12 - 5 = " + context.executeStrategy(12, 5));

      context = new Context(new OperationMultiply());		
      System.out.println("155 * 2 = " + context.executeStrategy(155, 2));
      
      context = new Context(new OperationDivide());		
      System.out.println("155 / 2 = " + context.executeStrategy(155, 2));
      
      context = new Context(new power());		
      System.out.println("155 ^ 2 = " + context.executeStrategy(15, 2));
      
      
   }
}
