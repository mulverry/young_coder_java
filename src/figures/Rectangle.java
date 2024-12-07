package figures;

public class Rectangle {
    int a;
    int b;

    public Rectangle(int storonal , int storonal2 ) {
       a = storonal;
       b = storonal2;
    }
    public int getArea() {
        return a*b;
    }

    public int getPerimeter() {
        return 2*(a+b);
    }
    }
