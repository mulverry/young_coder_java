import figures.Circle;
import figures.Rectangle;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 4);
        int area = rectangle.getArea();
        System.out.println(area);


        Rectangle rectangle1 = new Rectangle(8, 3);
        int perimeter = rectangle1.getPerimeter();
        System.out.println(perimeter);


    }
}

