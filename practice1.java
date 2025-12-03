public class practice1 {

      // using abstract;
      
      public static abstract class Shape {
            public abstract double getArea();
      }

      // Circle class extending Shape
      public static class Circle extends Shape {
            private double radius;

            public Circle(double radius) {
                  this.radius = radius;
            }

            @Override
            public double getArea() {
                  return Math.PI * radius * radius;
            }
      }

      // Rectangle class extending Shape
      public static class Rectangle extends Shape {
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
            Shape shape1 = new Circle(3);
            Shape shape2 = new Rectangle(2, 5);

            System.out.println("Circle Area : " + shape1.getArea());
            System.out.println("Rectangle Area : " + shape2.getArea());
            
      }
      
}
