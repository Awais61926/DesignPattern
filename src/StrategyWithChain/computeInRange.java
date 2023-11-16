/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategyWithChain;

/**
 *
 * @author FA20-BSE-021
 */
import java.util.Scanner;

// Step 1: Define the Strategy interface
interface Strategy {
    int execute(int a, int b);
}

// Step 2: Create concrete strategy classes
class ConcreteStrategyAdd implements Strategy {
    public int execute(int a, int b) {
        return a + b;
    }
}

class ConcreteStrategySubtract implements Strategy {
    public int execute(int a, int b) {
        return a - b;
    }
}

class ConcreteStrategyMultiply implements Strategy {
    public int execute(int a, int b) {
        return a * b;
    }
}

class ConcreteStrategyDivide implements Strategy {
    public int execute(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}

class ConcreteStrategyPower implements Strategy {
    public int execute(int base, int power) {
        return (int) Math.pow(base, power);
    }
}

// Step 3: Implement Chain of Responsibility pattern
class RangeHandler {
    private RangeHandler next;
    private int minRange;
    private int maxRange;
    private Strategy strategy;

    public RangeHandler(int minRange, int maxRange, Strategy strategy) {
        this.minRange = minRange;
        this.maxRange = maxRange;
        this.strategy = strategy;
    }

    public void setNext(RangeHandler next) {
        this.next = next;
    }

    public int handle(int a, int b) {
        if (a >= minRange && a <= maxRange && b >= minRange && b <= maxRange) {
            return strategy.execute(a, b);
        } else if (next != null) {
            return next.handle(a, b);
        } else {
            throw new IllegalArgumentException("Numbers are not in any valid range.");
        }
    }
}

// Step 4: Create a client class to input numbers and choose the appropriate strategy
public class computeInRange {
    public static void main(String[] args) {
        // Create strategy instances
        Strategy addStrategy = new ConcreteStrategyAdd();
        Strategy subtractStrategy = new ConcreteStrategySubtract();
        Strategy multiplyStrategy = new ConcreteStrategyMultiply();
        Strategy divideStrategy = new ConcreteStrategyDivide();
        Strategy powerStrategy = new ConcreteStrategyPower();

        // Create range handlers
        RangeHandler powerHandler = new RangeHandler(10000, 20000, powerStrategy);
        RangeHandler divideHandler = new RangeHandler(5000, 10000, divideStrategy);
        RangeHandler multiplyHandler = new RangeHandler(1000, 5000, multiplyStrategy);
        RangeHandler subtractHandler = new RangeHandler(100, 1000, subtractStrategy);
        RangeHandler addHandler = new RangeHandler(1, 100, addStrategy);

        // Set up the chain of responsibility
        addHandler.setNext(subtractHandler);
        subtractHandler.setNext(multiplyHandler);
        multiplyHandler.setNext(divideHandler);
        divideHandler.setNext(powerHandler);

        // Read input numbers
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Handle the numbers based on the specified range strategy
        int result = addHandler.handle(a, b);
        System.out.println("Result: " + result);

        scanner.close();
    }
}