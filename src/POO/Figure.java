package POO;

abstract class Figure {

  private static int figuresCreated=0;
  private final String name;
  protected Figure(String nme)
  {
      this.name=nme;
  }


    public abstract double getPerimeter();
    public abstract double getArea();

    public String getName() {
        return name;
    }

    public static int getFiguresCreated()
        {
            return figuresCreated;
        }
}
