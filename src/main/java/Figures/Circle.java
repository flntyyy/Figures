package Figures;

public class Circle extends GeometricFigure {

    public Circle (int side1) {
        super(side1);
    }

    public void perimeter() {

        System.out.println("Периметр круга " + side1);
    }

    public void area () {
        double area = (side1 * side1) * 3.14;
        System.out.println("Площадь прямоугольника " + area);

    }
}
