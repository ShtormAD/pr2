package Figure;

public class Square{
    private int x;
    private int y;
    private int a;

    //Конструктор
    public Square(int x, int y, int a){
        this.x = x;
        this.y = y;
        this.a = a;
    }

    //Сдвинуть на дельту по каждой оси
    public void move(int dx, int dy){
        x+=dx;
        y+=dy;
    }

    //Сдвинуть в конкретную точку
    public void moveTo(int nx, int ny){
        x=nx;
        y=ny;
    }

    //Изменеие размера, квадрат подразумевает равные стороны, просто складываем
    public void scale(int da){
        a +=da;
    }

    //Методы для получения положения и размера
    public int[] getXY(){return new int[]{x, y};}
    public int getX(){return x;}
    public int getY(){return y;}
    public int getA(){return a;}
}
