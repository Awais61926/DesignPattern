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
public class power implements Strategy{
   @Override
   public int doOperation(int num1, int num2) {
      return (int) Math. pow(5,4);
   }
}
