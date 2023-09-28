import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

class Main{
    public static void main (String[] args){
        Shape myObj = new Circle(5);
        Shape myObj1 = new Rectangle(10,2);

        System.out.println("Area of the Circle: " + myObj.calculateArea());
        System.out.println("Perimeter of the Circle: " + myObj.calculatePerimeter());

        System.out.println("Area of the Rectangle: " + myObj1.calculateArea());
        System.out.println("Perimeter of the Rectangle: " + myObj1.calculatePerimeter());

    }
}