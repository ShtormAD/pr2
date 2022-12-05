import Figure.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(15,10,5);
        System.out.println("Создан круг с [x,y] = "+ Arrays.toString(c1.getXY()) +" и r = "+c1.getR());
        System.out.println("Двигаем на 5 вправо и 7 вверх");
        c1.move(5,7);
        System.out.println("Круг перемещен в [x,y] = "+ Arrays.toString(c1.getXY()));
        System.out.println("Увеличим радиус на 2");
        c1.scale(2);
        System.out.println("Радиус окружности r = "+ c1.getR());

        //Функционал квадрата идентичено окружности, так что перейдем сразу к прямоугольнику

        Rectangle r1 = new Rectangle(7, 4, 3, 9);
        System.out.println("Создан прямоугольник с [x,y] = "+ Arrays.toString(r1.getXY()) +" и сторонами [xl,yl] = "+ Arrays.toString(r1.getSize()));
        System.out.println("Двигаем в точку [3,-7]");
        r1.moveTo(3,-7);
        System.out.println("Новые координаты [x,y] = "+ Arrays.toString(r1.getXY()));
        System.out.println("Увеличим прямоугольник по оси у на 4");
        r1.scaleY(4);
        System.out.println("Новый размер прямоугольника " + Arrays.toString(r1.getSize()));
    }
}