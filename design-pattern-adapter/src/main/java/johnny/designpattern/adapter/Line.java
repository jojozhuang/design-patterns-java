package johnny.designpattern.adapter;

public class Line {
    public void draw(int x1, int y1, int x2, int y2) {
        System.out.println("Line from point (" + x1 + "," + y1 + "), to point (" + x2 + "," + y2 + ")");
    }
}
