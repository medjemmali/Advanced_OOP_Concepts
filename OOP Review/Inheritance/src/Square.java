import java.util.Objects;

/* TODO : Complete the Square class.
 Add variables if you need.
 Remember to use the @Override to override methods.
intelliJ will be helpful if you do).*/
public class Square extends Shape{
    private double side;
    public Square(double side, String name) {
        super(name);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if (!(obj instanceof Square))
            return false;
        Square square = (Square) obj;
        if(this.side == square.side && this.name.equals(square.name))
            return true;

        return false;
    }

    @Override
    public String toString() {
        String str = super.name + ":" + this.side;
        return str;
    }
}