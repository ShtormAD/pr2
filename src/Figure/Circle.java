package Figure;

public class Circle {
    private int x;
    private int y;
    private int r;

    //Конструктор
    public Circle(int x, int y, int r){
        this.x = x;
        this.y = y;
        this.r = r;
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

    //Изменеие размера, окружность обрабатываем через радиус, увеличивая или изменяя
    public void scale(int dr){
      r+=dr;
    }

    //Методы для получения положения и размера
    public int[] getXY(){return new int[]{x, y};}
    public int getX(){return x;}
    public int getY(){return y;}
    public int getR(){return r;}
}
