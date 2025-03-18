package com.driver;

public class Main {
    
    public static class Product {
        // Task 3: Create a method to calculate product of two integers
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create an overloaded method to calculate product of three integers
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create an overloaded method to calculate product of two doubles
        public double product(double x, double y) {
            return x * y;
        }
    }





    public static void main(String[] args) {
        // Task 2: Create object of Product in Main function called p
        Product p = new Product();

        // Task 3: Call the method to calculate product of two integers
        int result1 = p.product(5, 6);
        System.out.println("Product of two integers: " + result1);

        // Task 4: Call the overloaded method to calculate product of three integers
        int result2 = p.product(5, 6, 7);
        System.out.println("Product of three integers: " + result2);

        // Task 5: Call the overloaded method to calculate product of two doubles
        double result3 = p.product(5.5, 6.6);
        System.out.println("Product of two doubles: " + result3);
    }
}
