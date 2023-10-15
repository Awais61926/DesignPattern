/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTask2 ;

/**
 *
 * @author Lenovo
 */

class Calculator {
    public int add(int a, int b) {
        int result = a + b;
        // Log the operation
        System.out.println("Added " + a + " and " + b + " to get " + result);
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        // Log the operation
        System.out.println("Subtracted " + b + " from " + a + " to get " + result);
        return result;
    }
}