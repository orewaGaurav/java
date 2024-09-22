abstract class Shapeex
{
    abstract int numberOfSides();
}

class Trapezoid extends Shapeex
{
    private int sides=4;
    int numberOfSides()
    {
        return sides;
    }
    public String toString()
    {
        return "Trapezoid";
    }
}

class Triangle extends Shapeex
{
    private int sides=3;
    int numberOfSides()
    {
        return sides;
    }
    public String toString()
    {
        return "Triangle";
    }
}

class Hexagon extends Shapeex
{   
    private int sides = 6;
    int numberOfSides()
    {
        return sides;
    }
    public String toString()
    {
        return "Hexagon";
    }
}

public class abstract1
{
    public static void main(String args[])
    {
    Shapeex[] shapes = new Shapeex[4];
    Trapezoid tp = new Trapezoid();
    Triangle tr = new Triangle();
    Hexagon hx = new Hexagon();
    shapes[0]=tp;
    shapes[1]=tr;
    shapes[2]=hx;
    for(int i=0 ; i<3 ;i++)
    {
        System.out.println(shapes[i].toString()+" #sides:"+shapes[i].numberOfSides());

    }

    }
}