package Figure;

public class Rectangle {
    private int x;
    private int y;
    private int xl;
    private int yl;

    //Конструктор
    public Rectangle(int x, int y, int xl, int yl){
        this.x = x;
        this.y = y;
        this.xl = xl;
        this.yl = yl;
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

    //Изменеие размера, для прямоугольник заложим возможность увеличивать по осям
    public void scaleX(int dx){xl+=dx;}
    public void scaleY(int dy){yl+=dy;}

    //Методы для получения положения и размера
    public int[] getXY(){return new int[]{x, y};}
    public int getX(){return x;}
    public int getY(){return y;}
    public int[] getSize(){return new int[]{xl, yl};}
    public int getXl(){return xl;}
    public int getYl(){return yl;}
}
