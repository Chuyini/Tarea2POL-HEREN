package POO;

import java.lang.reflect.Modifier;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String [] args)
    {
        List<Figure> figureList = new LinkedList<>();

        figureList.add(new Polygon(4, 5, 6.3f));
        figureList.add(new Polygon(4.5f, 8, 3.9f));
        figureList.add(new Rectangle(4, 5));
        figureList.add(new Rectangle(4.5f, 9.6f));
        figureList.add(new Circle(5.3f));
        figureList.add(new Circle(10.6f));

        for (Figure figure : figureList) {
            System.out.println(figure.getName() + ", Area: " + figure.getArea() + ", Perímetro: " + figure.getPerimeter());
        }

        if(Modifier.isAbstract(Figure.class.getModifiers())){
            System.out.println("Figure es abstracta");
        }

        System.out.println("Se generaron: " + Figure.getFiguresCreated() + " figuras");
    }
    }

