/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DecoratorPattern;

/**
 *
 * @author Lenovo
 */
public class DecoratorMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("\nTUTORIAL POINT EXAMPLE\n");
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle(), 1.0); 
        Shape redRectangle = new RedShapeDecorator(new Rectangle(), 5.0);
        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println("Total Cost: $" + circle.getPrice());

        System.out.println("\nCircle of red border");
        redCircle.draw();
        System.out.println("Total Cost: $" + redCircle.getPrice());

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
        System.out.println("Total Cost: $" + redRectangle.getPrice());
    }
    
}