#Diagrama figuras
![figuras](figuras.png)
@startuml
abstract class Figure{
-{static} figuresCreated: int;
-{final} name: String;

#Figure(name : String )
+ {abstarct} getArea();
  +{abstract} getPerimeter();

+getName(); String;
+{static} getFiguresCreated(): int;
}

class Circle extends Figure{
+getArea(): float;
+getPerimeter(): float;
}

class Rectangle extends Figure{
+getArea(): float;
+getPerimeter(): float;

}

class Polygon extends Figure{
+getArea(): floatt;
+getPerimeter(): float;

}


@enduml