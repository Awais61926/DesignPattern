/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DecoratorPattern;

/**
 *
 * @author Lenovo
 */
 interface Shape {
    void draw();

    double getPrice();
}

class Rectangle implements Shape {
    private double price = 10.0; // Price for the rectangle

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Circle implements Shape {
    private double price = 5.0; // Price for the circle

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }

    @Override
    public double getPrice() {
        return price;
    }
}

abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;
    protected double decoratorPrice;

    public ShapeDecorator(Shape decoratedShape, double decoratorPrice) {
        this.decoratedShape = decoratedShape;
        this.decoratorPrice = decoratorPrice;
    }

    public void draw() {
        decoratedShape.draw();
        System.out.println("Decoration Cost: $" + decoratorPrice);
    }

    @Override
    public double getPrice() {
        return decoratedShape.getPrice() + decoratorPrice;
    }
}

class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape, double decoratorPrice) {
        super(decoratedShape, decoratorPrice);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        System.out.println("Border Color: Red");
        System.out.println("Decoration Cost: $" + decoratorPrice);
    }
}