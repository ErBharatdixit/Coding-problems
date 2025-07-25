import java.util.*;
public class Practice {

         // using interface;
      public static interface Shape {
            double getArea();
      }

      
      public static class   Circle implements Shape {
            private double radius;

            public Circle(double radius) {
                  this.radius = radius;
            }

            @Override
            public double getArea() {
                  return Math.PI * radius * radius;
            }
      }

      
      public static class Rectangle implements Shape {
            private double length;
            private double width;

            public Rectangle(double length, double width) {
                  this.length = length;
                  this.width = width;
            }

            @Override
            public double getArea() {
                  return length * width;
            }
      }

     
      public static void main(String[] args) {
            Shape shape1 = new Circle(9);
            Shape shape2 = new Rectangle(6, 6);

            System.out.println("Circle Area : " + shape1.getArea());
            System.out.println("Rectangle Area : " + shape2.getArea());
            
      }
      
}
