package POO;

public class Circle extends Figure {
    float radio;



    Circle(float radio)
    {
        super("Circulo");
        this.radio=radio;
    }

    @Override
    public double getPerimeter() {
        double Perimetro;
        Perimetro=2*3.14*radio;
        return Perimetro;
    }

    @Override
    public double getArea() {
        double area;
        area=3.1416*radio*radio;
        return area;
    }

}
