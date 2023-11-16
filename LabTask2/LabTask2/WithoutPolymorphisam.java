/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LabTask2;

/**
 *
 * @author Lenovo
 */
class Circle1 {
    private double radius;

    public Circle1(double radius) {
        this.radius = radius;
    }

    public double calculateCircleArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle1 {
    private double length;
    private double width;

    public Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateRectangleArea() {
        return length * width;
    }
}