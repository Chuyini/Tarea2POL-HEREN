package POO;

public class Polygon extends Figure{
    float l1,l2,l3;


    Polygon(float l1,float l2, float l3)
    {
        super("poligono");
        this.l1=l1;
        this.l3=l3;
        this.l2=l2;

    }


    @Override
    public double getArea() {
        double area;
        area=((l1)*(l2)*(l3))/2;
return area;
    }
    @Override
    public double getPerimeter()
    {double perimeter;
        perimeter=l2*l3;
        return perimeter;

    }

}
