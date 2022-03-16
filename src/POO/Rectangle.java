package POO;

public class Rectangle extends Figure{
    float base;
    float lado;

public final String getName()
{
    return "Rectangulo ";
}

    @Override
    public double getArea() {

    double area;
    area=base*lado;
        return area;
    }

    @Override
    public double getPerimeter() {
    double perimeter;
    perimeter=(lado*2)+(base*2);

        return perimeter;
    }
    Rectangle(float lado, float base)
    {
        super("rectangulo");
        this.base=base;
        this.lado=lado;
    }
}
