package johnny.designpattern.common;

public class Line implements LineFlyweight {
    private Color color;

    public Line(Color c) {
        color = c;
    }
    public Color getColor() {
        return color;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Line: Draw() [Color : " + color + ", x : " + x + ", y :" + y + "]");
    }
}

